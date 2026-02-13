package com.evagr.navegacion.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun MyApp(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ){
        composable("home"){
            HomeScreen(navController)
        }

        composable(
            route = "detail/{nombre}",
            arguments = listOf(
                navArgument("nombre"){
                    type = NavType.StringType
                }
            )
        ){ backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            DetailScreen(name ?: "Sin nombre")
        }

    }
}