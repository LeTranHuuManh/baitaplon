package com.manhle.myapplication.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login(
    navigateToSignUp: () -> Unit
) {

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
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

        Text(text = "Login to your account", fontSize = 20.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = {
                email = it
            },
            label = { Text(text = "Email") },
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
            },
            label = { Text(text = "Password") },
            visualTransformation = PasswordVisualTransformation(),
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = Color(0xFFFF9F00),
                unfocusedBorderColor = Color(0xFFFF9F00),
                disabledBorderColor = Color(0xFFFF9F00)
            )

        )

        Spacer(modifier = Modifier.height(20.dp))


        Button(onClick = {
            Log.i("Credential", "Email:$email Password:$password")
        }, colors = ButtonDefaults.buttonColors(Color(0xFFFF9F00))) {
            Text(
                text = "Sign Up",
                modifier = Modifier.width(250.dp),
                textAlign = TextAlign.Center
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Forgot Password?", modifier = Modifier.clickable { })

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Or sign in with")

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(painter = painterResource(id = R.drawable.google), contentDescription = "",
                modifier = Modifier.clickable { })

            Image(painter = painterResource(id = R.drawable.facebook), contentDescription = "",
                modifier = Modifier.clickable { })

            Image(painter = painterResource(id = R.drawable.twitter), contentDescription = "",
                modifier = Modifier.clickable { })
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row {
            Text(text = "Already have an account ?")

            Text(text = " Sign In",
                color = Color(0xFFFF9F00),
                modifier = Modifier.clickable {
                    navigateToSignUp()
                }
            )
        }


    }
}