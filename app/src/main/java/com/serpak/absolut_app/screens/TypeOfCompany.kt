package com.serpak.absolut_app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable()
fun TypeOfCompany() {
    Column(
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            text = "Каким типом заведения вы владеете?"
        )
    }
}