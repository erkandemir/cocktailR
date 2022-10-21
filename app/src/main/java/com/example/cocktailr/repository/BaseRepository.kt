package com.example.cocktailr.repository

import com.example.cocktailr.api.Api
import com.example.cocktailr.api.ApiDataService
import com.example.cocktailr.api.IApiListener
import retrofit2.create

open class BaseRepository<T>(service: Class<T>) {
    var client : T
    init {
       client = Api.buildService(service)
    }
}