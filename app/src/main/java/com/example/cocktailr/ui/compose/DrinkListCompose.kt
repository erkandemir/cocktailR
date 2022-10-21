package com.example.cocktailr.ui.compose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.cocktailr.model.CoctailResponse

object DrinkListCompose {
    @Composable
    fun DrinkList(response: CoctailResponse) {
        Scaffold() {
            LazyColumn(modifier = Modifier.fillMaxWidth()) {
                items(response.drinks) { drinkItem ->
                    DrinkListRowCompose.DrinkList(drink = drinkItem)
                }
            }
        }
    }
}