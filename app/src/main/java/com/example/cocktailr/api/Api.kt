package com.example.cocktailr.api


import android.net.Uri
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object Api {
    val baseUrl = "https://www.thecocktaildb.com/"
    private val client = OkHttpClient.Builder().build()
    fun getApi() : Retrofit
    {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client)
            .build()
    }
    fun<T> buildService(service: Class<T>): T{
        return getApi().create(service)
    }
}