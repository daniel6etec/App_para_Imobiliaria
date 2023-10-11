package com.example.app_nav.pages

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.app_nav.ui.theme.Pink40
import com.example.app_nav.ui.theme.Purple40

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Scaffold ( topBar = { TopAppBar(
        title = {
            NavContent()
        },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Pink40
        ),
        navigationIcon = {

        }
    )
    }) {
        ContemHomeScreen(navController)
    }
}

@Composable
fun ContemHomeScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize().background(Purple40).padding(top = 80.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

        //BotaoCompra

    }
}