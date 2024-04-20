package com.manhle.myapplication.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.orderfoodapp.ui.theme.colorGreenDark
import com.example.orderfoodapp.ui.theme.colorWhite
import com.example.orderfoodapp.ui.theme.colorWhiteGray
import com.example.orderfoodapp.ui.theme.colorlightcyan

@Composable
fun DeliverTo(
    onBackClick: () -> Unit

){
    var isChecked by remember { mutableStateOf(false) }
    val checkboxColors = CheckboxDefaults.colors(
        checkedColor = Color.Green, // Màu khi nút tích chọn được chọn
        uncheckedColor = Color.White, // Màu khi nút tích chọn không được chọn
        checkmarkColor = Color.Blue // Màu của dấu tích
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorWhiteGray)
            .verticalScroll(rememberScrollState())
    ) {
        Column {
//Deliver To
            Spacer(modifier = Modifier.height(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .clip(RoundedCornerShape(15.dp))
                    .background(colorGreenDark),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start
            ) {


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 20.dp, top = 20.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    IconButton(
                        modifier = Modifier
                            .border(
                                BorderStroke(1.dp, colorWhite),
                                shape = CircleShape
                            )
                            .clip(CircleShape)
                            .background(colorWhite)
                            .size(43.dp),

                        onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Filled.LocationOn,
                            contentDescription = "",
                            tint = colorGreenDark

                        )
                    }
                    Column {
                        Text(
                            text = "Home",
                            fontSize = 17.sp,
                            color = colorWhite,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(end = 175.dp, start = 10.dp)

                        )
                        Text(
                            text = "Đà Nẵng, Hòa Phát, Cẩm ",
                            fontSize = 15.sp,
                            color = colorWhite,
                            modifier = Modifier.padding(start = 10.dp)
                        )
                    }
                    Checkbox(
                        checked = isChecked,
                        onCheckedChange = { isChecked = it },
                        colors = checkboxColors


                    )
                }

            }

            //button
            Spacer(modifier = Modifier.height(30.dp))


            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(colorlightcyan),
                modifier = Modifier
                    .height(50.dp)
                    .width(360.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    text = "Add New Address",
                    color = colorGreenDark,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier

                )
            }
//

            Spacer(modifier = Modifier.height(30.dp))


            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(colorGreenDark),
                modifier = Modifier
                    .height(50.dp)
                    .width(360.dp)
                    .align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(24.dp)
            ) {
                Text(
                    text = "Apply",
                    color = colorWhite,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier

                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun Demo(){
    DeliverTo {

    }
}