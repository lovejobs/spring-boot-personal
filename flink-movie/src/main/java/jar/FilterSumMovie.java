package jar;

import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.table.api.BatchTableEnvironment;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableEnvironment;
import org.apache.flink.types.Row;


public class FilterSumMovie {

    /**
     * 表中存储电影信息  movieId	title	genres
     */
    private static String movie_file_url = "/Users/fengxin/work/studyPlace/spring-boot-personal/flink-movie/movies.csv";

    /**
     * 表中存储了用户观看电影信息 userId	movieId	tag	timestamp
     */
    private static String user_file_url = "/Users/fengxin/work/studyPlace/spring-boot-personal/flink-movie/tags.csv";

    public static void main(String[] args) throws Exception {



        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        BatchTableEnvironment tableEnv = TableEnvironment.getTableEnvironment(env);


        DataSet<Tuple3<Long,String,String>> moveInfo = env.readCsvFile(movie_file_url).ignoreFirstLine().parseQuotedStrings('"').ignoreInvalidLines().types(Long.class, String.class, String.class);
        DataSet<Tuple4<Long,Long,String,String>> usermoveInfo = env.readCsvFile(user_file_url).ignoreFirstLine().parseQuotedStrings('"').ignoreInvalidLines().types(Long.class, Long.class, String.class,String.class);

        System.out.println("=================================="+moveInfo.count());
        System.out.println("=================================="+usermoveInfo.count());

        ((org.apache.flink.table.api.java.BatchTableEnvironment) tableEnv).registerDataSet("Movie",moveInfo,"movieId,title,genres");

        ((org.apache.flink.table.api.java.BatchTableEnvironment) tableEnv).registerDataSet("UserMovie",usermoveInfo,"userId,movieId,tag,timestamp");


        Table result = tableEnv.sqlQuery("select movieId,count(1) from UserMovie group by movieId order by count(1) desc");


        DataSet<Row> st  = ((org.apache.flink.table.api.java.BatchTableEnvironment) tableEnv).toDataSet(result,Row.class);

        st.print();


        Table table_user = tableEnv.scan("UserMovie");

        Table result_user = table_user.groupBy("movieId").select("movieId,count(1)");

        DataSet<Row> st_1  = ((org.apache.flink.table.api.java.BatchTableEnvironment) tableEnv).toDataSet(result_user,Row.class);

        st_1.print();

        //env.execute();
    }
}