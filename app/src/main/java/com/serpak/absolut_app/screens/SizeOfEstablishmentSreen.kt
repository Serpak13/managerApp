package com.serpak.absolut_app.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable()
fun SizeOfEstablishmentScreen(
    navController: NavHostController
){
    Text(
        text = "Size Of Establishment Screen",
        style = TextStyle(
            fontSize = 30.sp
        )
    )
}