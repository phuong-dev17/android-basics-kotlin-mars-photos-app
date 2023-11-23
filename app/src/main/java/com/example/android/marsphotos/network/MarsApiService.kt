package com.example.android.marsphotos.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET

private const val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

val retrofitBuilder = Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(ScalarsConverterFactory.create())
    .build()

interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos() :String
}

object MarsApi {
    val marsApiService: MarsApiService by lazy {
        retrofitBuilder.create(MarsApiService::class.java)
    }
}