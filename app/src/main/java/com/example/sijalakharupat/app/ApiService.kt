package com.example.sijalakharupat.app

import com.example.sijalakharupat.model.ResponModel
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name :String,
        @Field("email") email :String,
        @Field("nik") nik :String,
        @Field("password") password :String
    ):Call<ResponModel>


    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email:String,
        @Field("password") password:String
    ):Call<ResponModel>

}