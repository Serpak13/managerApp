package com.serpak.absolut_app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.serpak.absolut_app.screens.CompletedScreen
import com.serpak.absolut_app.screens.CreateStoreScreen
import com.serpak.absolut_app.screens.SizeOfEstablishmentScreen
import com.serpak.absolut_app.screens.TypeOfCompanyScreen
import com.serpak.absolut_app.screens.TypeOfServiceScreen
import com.serpak.absolut_app.screens.WelcomeScreen

@Composable()
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.WELCOME_SCREEN
    ){
        composable(Routes.WELCOME_SCREEN){
            WelcomeScreen(navController = navController)
        }
        composable(Routes.CREATE_STORE_SCREEN){
            CreateStoreScreen(navController = navController)
        }
        composable(Routes.TYPE_OF_COMPANY_SCREEN){
            TypeOfCompanyScreen(navController = navController)
        }
        composable(Routes.SIZE_OF_ESTABLISHMENT_SCREEN){
            SizeOfEstablishmentScreen(navController = navController)
        }
        composable(Routes.TYPE_OF_SERVICE_SCREEN){
            TypeOfServiceScreen(navController = navController)
        }
        composable(Routes.COMPLETED_SCREEN){
            CompletedScreen(navController = navController)
        }
    }
}