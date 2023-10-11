package com.example.app_nav.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.app_nav.pages.HomeScreen
import com.example.app_nav.pages.NovoScreen
import com.example.app_nav.ui.theme.Pink40

@Composable
fun RedButton(text: String, icon: ImageVector, onClick:() -> Unit) {
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, Color.Red),
        modifier = Modifier
            .border(1.dp, Color.White, MaterialTheme.shapes.extraSmall)
            .width(315.dp)
            .height(80.dp)
            .background(
                color = Pink40, // Cor de fundo do botão
            )

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )

            //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

            Text(
                text = text,
                color = Color.White,
                fontSize = 30.sp
            )
        }
    }
}


@Composable
fun LittleRedButton(text: String, icon: ImageVector, onClick:() -> Unit) {
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, Color.Red),
        modifier = Modifier
            .border(1.dp, Pink40, MaterialTheme.shapes.extraSmall)
            .fillMaxWidth()
            .height(60.dp)
            .background(
                color = Pink40, // Cor de fundo do botão
            )

    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Color.White,
                modifier = Modifier.size(40.dp)
            )

            //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto

            Text(
                text = text,
                color = Color.White,
                fontSize = 20.sp
            )
        }
    }
}

//BOTAO COM FUNDO BRANCO
@Composable
fun WhiteButton(text: String, icon: ImageVector, onClick:() -> Unit){
    TextButton(
        onClick = onClick,
        border = BorderStroke(0.dp, Color.White),
        modifier = Modifier
            //.border(1.dp, Color.White, MaterialTheme.shapes.extraLarge)
            .width(315.dp)
            .height(80.dp)
            .background(
                Color.White,
                shape = RoundedCornerShape(50.dp)
            ),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {

            //Spacer(modifier = Modifier.width(28.dp)) // Espaço entre o ícone e o texto
            Text(
                text = text,
                color = Pink40,
                fontSize = 30.sp
            )

            Icon(
                imageVector = icon,
                contentDescription = "Icon",
                tint = Pink40,
                modifier = Modifier.size(40.dp)
            )
        }
    }
}


@Composable
fun BackButton(onClick:() -> Unit){
    TextButton(onClick = onClick) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Icon",
            tint = Color.White,
            modifier = Modifier.size(30.dp)
        )
    }
}






@Preview(showBackground = true)
@Composable
fun ButtonRedPreview(){
    val navController = rememberNavController()
    Column(
        //modifier = Modifier.fillMaxSize()
    ){
        //BTN VERMELHO
        RedButton("Olá", Icons.TwoTone.Favorite){
            navController.navigate("comprar")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonWhitePreview(){
    val navController = rememberNavController()
    Column(
        modifier = Modifier.background(Pink40)
    ){
        //BTN BRANCO
        WhiteButton("Olá", Icons.Default.KeyboardArrowRight){
            navController.navigate("comprar")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ButtonLittleRedPreview(){
    val navController = rememberNavController()
    Column(
        modifier = Modifier.background(Pink40)
    ){
        //BTN BRANCO
        LittleRedButton("Olá", Icons.Default.KeyboardArrowRight){
            navController.navigate("comprar")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun HomePreview(){
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun NovoPreview(){
    val navController = rememberNavController()
    NovoScreen(navController = navController)
}