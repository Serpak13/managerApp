package com.serpak.absolut_app.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun CompletedScreen(
    navController: NavHostController
){
    Text(
        text = "Completed Screen",
        style = TextStyle(
            fontSize = 32.sp
        )
    )
}