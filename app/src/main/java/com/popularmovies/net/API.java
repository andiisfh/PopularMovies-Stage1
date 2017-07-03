package com.popularmovies.net;

import com.popularmoviesdomain.model.MoviesModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by andiisfh on 01/07/17.
 */

public interface API {

    @GET("/3/movie/popular")
    Call<MoviesModel> getPopularMovies(@Query("api_key") String api_key);

    @GET("/3/movie/top_rated")
    Call<MoviesModel> getTopRatedMovies(@Query("api_key") String api_key);
}
