package com.serpak.absolut_app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


//@Preview(showBackground = true)
@Composable
fun WelcomeScreen(
    navController:NavHostController
){

    var textStateInputName by remember{ mutableStateOf("")}
    var textStateInputPhoneNumber by remember{ mutableStateOf("")}

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "Добро пожаловать!",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = "Введите имя, номер телефона или адрес электронной почты для регистрации",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(15.dp))

        //InputName
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = textStateInputName,
            onValueChange = { textStateInputName = it },
            placeholder = {
                Text(
                    text = "Ваше имя",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )
                )
            },
            label = { Text(text = "Ваше имя") }
        )
        Spacer(modifier = Modifier.height(30.dp))
        //Input Phone number
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = textStateInputPhoneNumber,
            onValueChange = { textStateInputPhoneNumber = it },
            placeholder = {
                Text(
                    text = "Телефон или почта",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )
                )
            },
            label = {Text(text = "Телефон и почта")}
        )
    }
}