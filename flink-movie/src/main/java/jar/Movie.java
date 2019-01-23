package jar;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class Movie implements Serializable {

    public Movie(){};

    public Movie(String title, Set<String> genres){

        this.title=title;
        this.genres=genres;
    }

    private Long movieId;

    private String title;

    private Set<String> genres;


    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<String> getGenres() {
        return genres;
    }

    public void setGenres(Set<String> genres) {
        this.genres = genres;
    }
}
