package com.example.cocktailr.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.cocktailr.model.Drink

object DrinkListRowCompose {
    @Composable
    fun ItemRow(drink : Drink)
    {
        Column()
            {
                Column() {
                    AsyncImage(
                        model = drink.img,
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )

                    Text(
                        drink.name,
                        modifier = Modifier.padding(10.dp)
                            .height(50.dp)
                    )
                }

            }





    }
}