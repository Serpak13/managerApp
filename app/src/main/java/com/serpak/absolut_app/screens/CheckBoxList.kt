package com.serpak.absolut_app.screens

import android.widget.CheckBox
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.selection.toggleable

import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.serpak.absolut_app.R

//@Preview(showBackground = true)
@Composable()
fun CheckBoxListOne(){

    val itemsList = listOf(
        Pair("Ресторан", R.drawable.ic_bar),
        Pair("Бар", R.drawable.ic_bar),
        Pair("Кафе", R.drawable.ic_bar),
        Pair("Столовая", R.drawable.ic_bar),
        Pair("Кофейня", R.drawable.ic_bar),
        Pair("Кулинария", R.drawable.ic_bar),
        Pair("Другое", R.drawable.ic_bar),

    )
    // Состояние для хранения, какие элементы выбраны
    var selectedItems by remember { mutableStateOf(listOf<String>()) }

   LazyColumn {
       items(itemsList.size){ index ->
           val item = itemsList[index]
           Column {
               Row(
                   modifier = Modifier
                       .fillMaxWidth()
                       .padding(12.dp)
                       .toggleable(
                           value = selectedItems.contains(item.first),
                           onValueChange = {
                               selectedItems = if (it) {
                                   selectedItems + item.first
                               } else {
                                   selectedItems - item.first
                               }
                           }
                       ),
                   verticalAlignment = Alignment.CenterVertically
               ){
                   Image(
                       painter = painterResource(id = item.second),
                       contentDescription = null,
                       modifier = Modifier.size(24.dp)
                   )
                   Text(
                       text = item.first,
                       fontSize = 18.sp,
                       modifier = Modifier
                           .weight(1f)
                           .padding(start = 8.dp)
                   )
                   Checkbox(
                       checked = selectedItems.contains(item.first),
                       onCheckedChange = null
                   )
               }
               Divider(
                   color = Color.Gray,
                   thickness = 1.dp,
                   modifier = Modifier.fillMaxWidth()
               )
           }
       }
   }
}


@Composable
fun CheckBoxListTwo(){

    val itemsList = listOf(
        Pair("Навынос", R.drawable.ic_bar),
        Pair("В заведении", R.drawable.ic_bar),
        Pair("Доставка", R.drawable.ic_bar)
        )
    // Состояние для хранения, какие элементы выбраны
    var selectedItems by remember { mutableStateOf(listOf<String>()) }

    LazyColumn {
        items(itemsList.size){ index ->
            val item = itemsList[index]
            Column {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                        .toggleable(
                            value = selectedItems.contains(item.first),
                            onValueChange = {
                                selectedItems = if (it) {
                                    selectedItems + item.first
                                } else {
                                    selectedItems - item.first
                                }
                            }
                        ),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = item.second),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                    Text(
                        text = item.first,
                        fontSize = 18.sp,
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 8.dp)
                    )
                    Checkbox(
                        checked = selectedItems.contains(item.first),
                        onCheckedChange = null
                    )
                }
                Divider(
                    color = Color.Gray,
                    thickness = 1.dp,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}