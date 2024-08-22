package com.serpak.absolut_app.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
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
@Composable()
fun CreateStoreScreen(
    navController: NavHostController
) {

    var textStateInputCompanyName by remember { mutableStateOf("") }
    var textStateInputCountryAndCity by remember { mutableStateOf("") }
    var textStateInputAddress by remember { mutableStateOf("") }
    var textStateInputSystemAuto by remember { mutableStateOf("") }
    var isChecked by remember { mutableStateOf(false) }
    var isNewCompany by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Text(
            text = "Создайте первое заведение",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Вы всегда можете изменить данные в настройках",
            style = TextStyle(
                fontSize = 15.sp,
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(10.dp))
        //InputCompanyName
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth(),
            value = textStateInputCompanyName,
            onValueChange = { textStateInputCompanyName = it },
            placeholder = {
                Text(
                    text = "Название заведения",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )
                )
            },
            label = { Text(text = "Название заведения") }
        )
        Text(
            modifier = Modifier.padding(top = 5.dp, start = 15.dp),
            text = "Далее вы сможете добавлять ещё заведения",
            style = TextStyle(
                fontSize = 12.sp,
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(15.dp))
        //Input Country and City
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = textStateInputCountryAndCity,
            onValueChange = { textStateInputCountryAndCity = it },
            placeholder = {
                Text(
                    text = "Страна и город",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )
                )
            },
            label = { Text(text = "Страна и город") }
        )
        Text(
            modifier = Modifier.padding(top = 5.dp, start = 15.dp),
            text = "Требуется для определения часового пояса",
            style = TextStyle(
                fontSize = 12.sp,
                color = Color.Gray
            )
        )
        Spacer(modifier = Modifier.height(15.dp))
        //Input Address
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = textStateInputAddress,
            onValueChange = { textStateInputAddress = it },
            placeholder = {
                Text(
                    text = "Адрес",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )
                )
            },
            label = { Text(text = "Адрес") }
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Checkbox(
                checked = isChecked,
                onCheckedChange = {
                    isChecked = it
                    isNewCompany = !it
                }
            )
            Column {
                Text(
                    modifier = Modifier.padding(bottom = 5.dp),
                    text = "Это новое заведение",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                )
                Text(
                    text = "Отметьте галочкойб если ваше заведение только начало работу",
                    style = TextStyle(
                        color = Color.Gray
                    )
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        if (isNewCompany) {
            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(),
                value = textStateInputSystemAuto,
                onValueChange = { textStateInputSystemAuto = it },
                placeholder = {
                    Text(
                        text = "Система автоматизации",
                        style = TextStyle(
                            fontSize = 18.sp,
                            color = Color.Gray
                        )
                    )
                },
                label = { Text(text = "Система автоматизации") }
            )
            Text(
                modifier = Modifier.padding(top = 5.dp, start = 15.dp),
                text = "Название системы, которой вы пользовались ранее",
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            )
        }

    }

}