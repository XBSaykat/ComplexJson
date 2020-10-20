package com.xbsaykat.complexjsonintrigrationwithretrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface Api {
    @GET("data/2.5/weather?")
    Call<Model> getWether(@Query("lat") double lat,@Query("lon") double lon,@Query("appid") String api);
}
