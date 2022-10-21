package com.example.cocktailr

import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cocktailr.api.IApiListener
import com.example.cocktailr.model.CoctailResponse
import com.example.cocktailr.repository.DrinkRepository
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import retrofit2.Response
import kotlin.coroutines.coroutineContext

class MainViewModel() : ViewModel() {
    init {
        getDrinkList()
    }
    val cocktailResponse : MutableLiveData<CoctailResponse> by lazy {
        MutableLiveData<CoctailResponse>()
    }

    fun getDrinkList() {
        viewModelScope.launch {
            val response = DrinkRepository.getDrinkList()
           cocktailResponse.value  = response.body()
        }
    }
}