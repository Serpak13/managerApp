package com.serpak.absolut_app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable()
fun TypeOfServiceScreen(
    navController: NavHostController
){
   Column(
       modifier = Modifier
           .fillMaxSize()
           .padding(20.dp)
   ){
       Text(
           text ="Какие типы сервисов вы будете предоставлять в вашем заведении?",
           style = TextStyle(
               fontSize = 25.sp,
               fontWeight = FontWeight.Bold
           )
       )
       Spacer(modifier = Modifier.height(15.dp))
       CheckBoxListTwo()
   }
}