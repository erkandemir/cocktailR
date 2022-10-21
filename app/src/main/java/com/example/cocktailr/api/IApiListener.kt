package com.example.cocktailr.api

interface IApiListener<T> {
    fun onComplate(response : T)
    fun onError()
}