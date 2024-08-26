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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable()
fun SizeOfEstablishmentScreen(
    navController: NavHostController,
    viewModel: StoreViewModel = hiltViewModel()
){
    var textStateInputArea by remember{mutableStateOf("")}
    var textStateInputQuantity by remember{mutableStateOf("")}
    var textStateInputAreaForGuests by remember{mutableStateOf("")}
    var textStateInputAreaKitchen by remember{mutableStateOf("")}
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ){
        Text(
            text = "Укажите размеры вашего заведения",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
        )
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp),
            value = textStateInputArea,
            onValueChange = {textStateInputArea = it},
            placeholder = {
                Text(
                    text="Общая площадь помещения",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )

                )
            },
            label = {Text(text = "Общая площадь помещения")}
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = textStateInputQuantity,
            onValueChange = {textStateInputQuantity = it},
            placeholder = {
                Text(
                    text="Количество посадочных мест",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )

                )
            },
            label = {Text(text = "Количество посадочных мест")}
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = textStateInputAreaForGuests,
            onValueChange = {textStateInputAreaForGuests = it},
            placeholder = {
                Text(
                    text="Площадь залов для посетителей",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )

                )
            },
            label = {Text(text = "Площадь залов для посетителей")}
        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = textStateInputAreaKitchen,
            onValueChange = {textStateInputAreaKitchen = it},
            placeholder = {
                Text(
                    text="Площадь кухни",
                    style = TextStyle(
                        fontSize = 18.sp,
                        color = Color.Gray
                    )

                )
            },
            label = {Text(text = "Площадь кухни")}
        )
    }
}