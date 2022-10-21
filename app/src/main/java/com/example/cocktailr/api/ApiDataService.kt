package com.example.cocktailr.api

import com.example.cocktailr.model.CoctailResponse
import com.example.cocktailr.model.Drink
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface ApiDataService {
    @GET("api/json/v1/1/filter.php?c=Cocktail")
    suspend fun getDrinklist(): Response<CoctailResponse>
}