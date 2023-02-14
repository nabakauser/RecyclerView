package com.example.recyclerviewactivity

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

// https://newsapi.org/v2/top-headlines?country=in&apiKey=API_KEY

const val BASE_URL = "https://newsapi.org/"
const val API_KEY = "55818053ca304dd389c7d3fe367a5d58"

interface NewsInterface {

    @GET("v2/top-headlines?apiKey=$API_KEY")
    fun getHeadLines(@Query("country")country: String, @Query("page")page: Int): Call<News>

    //https://newsapi.org/v2/top-headlines?apiKey=55818053ca304dd389c7d3fe367a5d58&country=in&page=1
}

object NewsService {
    val newsInstance: NewsInterface
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        newsInstance = retrofit.create(NewsInterface::class.java)
    }
}