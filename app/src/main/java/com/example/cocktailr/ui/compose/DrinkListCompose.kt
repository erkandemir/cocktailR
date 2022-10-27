package com.example.cocktailr.ui.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.cocktailr.model.CoctailResponse

object DrinkListCompose {
    @Composable
    fun DrinkList(response: CoctailResponse, gridItemCount : Int = 1) {
        LazyVerticalGrid(
                columns = GridCells.Fixed(gridItemCount))
            {
                items(response.drinks) { drinkItem ->
                    Card(
                        modifier = Modifier.padding(15.dp)
                            .width(200.dp),
                        elevation = 5.dp,
                        content = { DrinkListRowCompose.ItemRow(drink = drinkItem) }
                    )
                }
            }
    }
}