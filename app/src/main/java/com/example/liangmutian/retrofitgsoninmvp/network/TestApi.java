package com.example.liangmutian.retrofitgsoninmvp.network;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by lmt on 16/6/28.
 */
public interface TestApi {

    @FormUrlEncoded
    @GET("")
    Call<ResponseBody> get(

    );

    @FormUrlEncoded
    @POST("/x3/weather")
    Call<ResponseBody> get(
            @Field("cityid") String cityid,
            @Field("key") String key
    );


}
