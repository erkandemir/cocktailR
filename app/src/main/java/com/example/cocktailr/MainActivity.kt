package com.example.cocktailr

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModelProvider
import com.example.cocktailr.model.CoctailResponse
import com.example.cocktailr.ui.compose.DrinkListCompose
import com.example.cocktailr.ui.theme.CocktailRTheme

class MainActivity : ComponentActivity() {
    var coctailResponse : CoctailResponse? = null
    lateinit var mainViewModel : MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        showDrinkList()
    }

    fun showDrinkList()
    {
        mainViewModel.cocktailResponse.observe(this) { drinkList ->
            setContent {
                MaterialTheme(

                )
                {
                    Scaffold(
                        topBar = {
                            TopAppBar() {
                                    Text("cocktailR")
                        }}, bottomBar = {
                            BottomAppBar() {
                                Text("My bottom bar")
                            }
                        }
                    ) { paddingValue ->
                        Surface(
                            modifier = Modifier
                                .padding(paddingValue)
                        ) {
                            DrinkListCompose.DrinkList(response = drinkList, gridItemCount = 2)
                        }
                    }
                }
            }
        }
    }
}

