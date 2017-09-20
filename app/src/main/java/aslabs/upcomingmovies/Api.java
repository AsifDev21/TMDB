package aslabs.upcomingmovies;

import retrofit2.http.GET;

/**
 * Created by asif on 20/09/2017.
 */

public interface  Api {
    //https://api.themoviedb.org/3/movie/upcoming
    //api_key – b7cd3340a794e5a2f35e3abb820b497f
    @GET("upcoming")
    void upcomingMovies();

//    https://api.themoviedb.org/3/movie/<movie-id>
//    api_key – b7cd3340a794e5a2f35e3abb820b497f

//    https://api.themoviedb.org/3/movie/<movie-id>/images
}
