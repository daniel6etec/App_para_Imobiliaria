package com.example.app_nav.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun navManger(){
    val navController = rememberNavController()

    NavHost(navController = navController, starDestination = "home"){
        composable("home"){
            HomePage(navController)
        }
    }
}