package com.kotlin.moonlightbarapp.util

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bedtime
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocalDrink
import androidx.compose.material.icons.filled.WineBar
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destination(val route: String, val icon: ImageVector, val title: String) {
    object MoonBar : Destination(
        route = "MoonBar", icon = Icons.Filled.Bedtime,
        title = "Moon Bar"
    )
    object Favoritos : Destination(
        route = "Favoritos", icon = Icons.Filled.Favorite,
        title = "Favoritos"
    )
    object Populares : Destination(
        route = "Cocktails", icon = Icons.Filled.WineBar,
        title = "Cocktails"
    )
    object ChosenCocktail : Destination(
        route = "ChosenCocktail", icon = Icons.Filled.LocalDrink,
        title = "ChosenCocktail"
    )
}