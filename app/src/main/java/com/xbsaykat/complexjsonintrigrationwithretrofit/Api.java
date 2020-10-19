package com.xbsaykat.complexjsonintrigrationwithretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    @GET("data/2.5/onecall?")
    Call<Model> getWether(@Query("lat") double lat,@Query("lon") double lon,@Query("exclude") String exclude,@Query("appid") String api);
}
