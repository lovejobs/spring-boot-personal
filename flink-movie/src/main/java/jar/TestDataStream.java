package jar;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class TestDataStream {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment see  = StreamExecutionEnvironment.createLocalEnvironment();

        DataStream<String> dataStream_str = see.fromElements("1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4","1","2","3","4");

        DataStream<Integer> dataStream_int = dataStream_str.map(new MapFunction<String, Integer>() {
            @Override
            public Integer map(String s) throws Exception {
                return Integer.valueOf(s);
            }
        });

        DataStream<Integer> dataStream_int_2 = dataStream_str.map(s->Integer.valueOf(s)*100);

        dataStream_int_2.print();
        see.execute();
    }
}
