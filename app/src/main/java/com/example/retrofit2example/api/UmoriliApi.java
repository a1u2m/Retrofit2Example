package com.example.retrofit2example.api;

import com.example.retrofit2example.model.PostModel;

import java.util.List;

import io.reactivex.rxjava3.core.Flowable;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UmoriliApi {

    @GET("/api/get")
    Flowable<List<PostModel>> getData(@Query("name") String recourceName, @Query("num") int count);

}
