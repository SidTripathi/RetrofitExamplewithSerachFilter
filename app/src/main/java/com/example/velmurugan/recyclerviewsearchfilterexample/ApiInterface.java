package com.example.velmurugan.recyclerviewsearchfilterexample;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("GetProjects")
    Call<List<Movie>> getMovies();
}
