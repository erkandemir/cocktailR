package com.example.cocktailr.model

import androidx.lifecycle.MutableLiveData
import com.google.gson.annotations.SerializedName

data class CoctailResponse(
    val drinks : MutableList<Drink>
)

data class Drink(val idDrink : Int)
{
    @SerializedName("strDrink")
    var name : String = ""
    @SerializedName("strDrinkThumb")
    var img : String = ""
}
