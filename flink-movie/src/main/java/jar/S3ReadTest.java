package jar;

import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class S3ReadTest {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment see  = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<String> s3data = see.readTextFile("s3://ugs.abtest.us-east-1.prod/tmp/random_88_20181215.txt");

        s3data.writeAsText("s3://ugs.abtest.us-east-1.prod/tmp/random_88_20181215_fengxin.txt");
        see.execute();
    }
}
