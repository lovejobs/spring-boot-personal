package jar;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.api.java.tuple.Tuple3;

import java.util.Arrays;
import java.util.HashSet;

public class FilterMovie {

    private static String file_url = "/Users/fengxin/work/studyPlace/spring-boot-personal/flink-movie/movies.csv";

    public static void main(String[] args) throws Exception {
        ExecutionEnvironment env = ExecutionEnvironment.createCollectionsEnvironment();
        DataSet<Tuple3<Long,String,String>> lines = env.readCsvFile(file_url).ignoreFirstLine().parseQuotedStrings('"').ignoreInvalidLines().types(Long.class, String.class, String.class);
        System.out.println(lines.count());

        DataSet<Movie> movies = lines.map(new MapFunction<Tuple3<Long, String, String>, Movie>() {
            @Override
            public Movie map(Tuple3<Long, String, String> longStringStringTuple3) throws Exception {
                String movieName = longStringStringTuple3.f1;
                String[] genres = longStringStringTuple3.f2.split("\\|");
                return new Movie(movieName,new HashSet<>(Arrays.asList(genres)));
            }
        });

        DataSet<Movie> filteredMovies = movies.filter(new FilterFunction<Movie>() {
            @Override
            public boolean filter(Movie movie) throws Exception {
                return movie.getGenres().contains("Action");
            }
        });
        System.out.println(filteredMovies.count());

        filteredMovies.writeAsText("/Users/fengxin/work/studyPlace/spring-boot-personal/flink-movie/movie-filter.text");

        env.execute();
    }
}
