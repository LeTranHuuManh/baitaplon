package com.manhle.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manhle.myapplication.R

@Composable
fun Register(
    onBackClick: () -> Unit
){

    var fullName by remember {
        mutableStateOf("")
    }
    var phone by remember {
        mutableStateOf("")
    }
    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }


    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(id = R.drawable.arrow),
            contentDescription = "",
            modifier = Modifier.clickable {
                onBackClick()
            }
        )
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.fast_food), contentDescription = "",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "You register for an account", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = fullName
            , onValueChange = {
                              fullName = it
            }
            , label = {Text(text = "Full name")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFFF9F00),
                unfocusedBorderColor = Color(0xFFFF9F00),
                disabledBorderColor = Color(0xFFFF9F00)
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = phone
            , onValueChange = {
                              phone = it
            }
            , label = {Text(text = "Phone")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFFF9F00),
                unfocusedBorderColor = Color(0xFFFF9F00),
                disabledBorderColor = Color(0xFFFF9F00),
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email
            , onValueChange = {
                              email = it
            }
            , label = {Text(text = "Email")},
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFFF9F00),
                unfocusedBorderColor = Color(0xFFFF9F00),
                disabledBorderColor = Color(0xFFFF9F00)
            )
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = {
                            password = it
            } ,
            label = { Text(text = "Password")},
            visualTransformation = PasswordVisualTransformation(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFFF9F00),
                unfocusedBorderColor = Color(0xFFFF9F00),
                disabledBorderColor = Color(0xFFFF9F00)
            )

        )
        
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { }, colors = ButtonDefaults.buttonColors(Color(0xFFFF9F00))) {
            Text(text = "Sign In",
                modifier = Modifier.width(250.dp),
                textAlign = TextAlign.Center
            )
        }
    }
}