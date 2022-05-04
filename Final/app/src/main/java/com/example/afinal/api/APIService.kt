package com.example.afinal.api

import com.example.afinal.models.News
import retrofit2.Call
import retrofit2.http.*



interface APIService {
    @GET("top-headlines")
    fun get(@Query("category") category: String?,
            @Query("country") country_code: String?,
            @Query("apiKey") apiKey: String? = "979f244184bd4a63a779868896b32b8f"): Call<News>
}

