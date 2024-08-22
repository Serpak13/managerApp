package com.serpak.absolut_app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

//@Preview(showBackground = true)
@Composable()
fun TypeOfCompanyScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "Каким типом заведения вы владеете?"
        )
    }
}