package com.evagr.navegacion.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.evagr.navegacion.ui.theme.NavegacionTheme

@Composable
fun DetailScreen(name: String){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            "Hola $name"
        )

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DetailScreenPreview(){
    NavegacionTheme() {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            DetailScreen("Eva")
        }
    }
}