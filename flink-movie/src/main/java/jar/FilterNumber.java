package jar;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;

public class FilterNumber {

    public static void main(String[] args) throws Exception {
        ExecutionEnvironment env = ExecutionEnvironment.createCollectionsEnvironment();

        DataSet<Integer> numbers = env.fromElements(1,2,3,4,5,6,7,8,9);

        DataSet<Integer> result = numbers.map(new MapFunction<Integer, Integer>() {
            @Override
            public Integer map(Integer integer) throws Exception {

                return integer*integer;
            }
        });

        DataSet<Integer> result_1 =numbers.filter(new FilterFunction<Integer>() {
            @Override
            public boolean filter(Integer integer) throws Exception {
                return integer%2 == 0;
            }
        });

        result_1.writeAsText("/Users/fengxin/work/studyPlace/spring-boot-personal/flink-movie/numbers-filter.text");

        env.execute();
    }
}
