package com.serpak.absolut_app.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

//@Preview(showBackground = true)
@Composable()
fun TypeOfCompanyScreen(
    navController: NavHostController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Text(
            text = "Каким типом заведения вы владеете?",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Расскажите нмного больше о вашем бизнесе, чтобы мы смогли подобрать " +
                    "для вас полезные инструменты",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(15.dp))
        CheckBoxListOne()

    }
}