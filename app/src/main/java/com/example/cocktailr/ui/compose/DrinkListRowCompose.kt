package com.example.cocktailr.ui.compose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.cocktailr.model.Drink

object DrinkListRowCompose {
    @Composable
    fun DrinkList(drink : Drink)
    {
        Row() {
            Column() {
                AsyncImage(model = drink.img,
                    contentDescription ="",
                    modifier = Modifier.padding(20.dp))
                Text(drink.name)
            }
        }
    }
}