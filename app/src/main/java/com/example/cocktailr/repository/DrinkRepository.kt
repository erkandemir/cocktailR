package com.example.cocktailr.repository

import android.widget.Toast
import com.example.cocktailr.api.Api
import com.example.cocktailr.api.ApiDataService
import com.example.cocktailr.api.IApiListener
import com.example.cocktailr.model.CoctailResponse
import com.example.cocktailr.model.Drink
import retrofit2.*

class DrinkRepository : BaseRepository<ApiDataService>(ApiDataService::class.java) {
    suspend fun getDrinkList() : Response<CoctailResponse> {
        return client.getDrinklist()
    }
}
