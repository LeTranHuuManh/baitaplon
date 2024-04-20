package com.manhle.myapplication.nav

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.manhle.myapplication.screens.Login
import com.manhle.myapplication.screens.Register

@Composable
fun OrderFoodNavavigation(
    navController: NavHostController = rememberNavController()
){
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = OrderFoodRoute.valueOf(
        backStackEntry?.destination?.route ?: OrderFoodRoute.LOGIN.name
    )

    NavHost(navController = navController, startDestination = OrderFoodRoute.LOGIN.name , builder = {
        composable(OrderFoodRoute.LOGIN.name) {
            Login(
                navigateToSignUp = { navController.navigate(OrderFoodRoute.SIGNUP.name) }
            )
        }

        composable(OrderFoodRoute.SIGNUP.name) {
            Register(
                onBackClick = { navController.navigateUp() }
            )
        }
    })
}