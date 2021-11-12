package com.example.retrofit2example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UmoriliApi {

    @GET("/api/get")
    Call<List<PostModel>> getData(@Query("name") String recourceName, @Query("num") int count);

}
