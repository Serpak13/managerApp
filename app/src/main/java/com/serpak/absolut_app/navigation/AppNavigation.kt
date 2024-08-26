import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.serpak.absolut_app.R
import com.serpak.absolut_app.navigation.Routes
import com.serpak.absolut_app.screens.CompletedScreen
import com.serpak.absolut_app.screens.CreateStoreScreen
import com.serpak.absolut_app.screens.SizeOfEstablishmentScreen
import com.serpak.absolut_app.screens.TypeOfCompanyScreen
import com.serpak.absolut_app.screens.TypeOfServiceScreen
import com.serpak.absolut_app.screens.WelcomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val screens = listOf(
        Routes.WELCOME_SCREEN,
        Routes.CREATE_STORE_SCREEN,
        Routes.TYPE_OF_COMPANY_SCREEN,
        Routes.SIZE_OF_ESTABLISHMENT_SCREEN,
        Routes.TYPE_OF_SERVICE_SCREEN,
        Routes.COMPLETED_SCREEN
    )

    // Состояние для отслеживания текущего экрана
    var currentScreenIndex by remember { mutableStateOf(0) }

    Box{
      //  Image(painter = painterResource(id = R.drawable), contentDescription = )
    }
    Scaffold(
        topBar = {
            // Прогрессбар
            LinearProgressIndicator(
                progress = (currentScreenIndex + 1).toFloat() / screens.size,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 25.dp)
            )
        },
        bottomBar = {
            // Панель с кнопками "Назад" и "Далее"
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Кнопка "Назад"
                if (currentScreenIndex > 0) {
                    Button(onClick = {
                        if (currentScreenIndex > 0) {
                            currentScreenIndex--
                            navController.popBackStack()
                        }
                    }) {
                        Text(text = "Назад")
                    }
                }

                Spacer(modifier = Modifier.weight(1f))

                // Кнопка "Далее"
                Button(onClick = {
                    if (currentScreenIndex < screens.size - 1) {
                        currentScreenIndex++
                        navController.navigate(screens[currentScreenIndex])
                    }
                }) {
                    Text(text = "Далее")
                }
            }
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = screens[0],
            modifier = Modifier.padding(it)
        ) {
            composable(Routes.WELCOME_SCREEN) {
                WelcomeScreen(navController = navController)
            }
            composable(Routes.CREATE_STORE_SCREEN) {
                CreateStoreScreen(navController = navController)
            }
            composable(Routes.TYPE_OF_COMPANY_SCREEN) {
                TypeOfCompanyScreen(navController = navController)
            }
            composable(Routes.SIZE_OF_ESTABLISHMENT_SCREEN) {
                SizeOfEstablishmentScreen(navController = navController)
            }
            composable(Routes.TYPE_OF_SERVICE_SCREEN) {
                TypeOfServiceScreen(navController = navController)
            }
            composable(Routes.COMPLETED_SCREEN) {
                CompletedScreen(navController = navController)
            }
        }
    }
}


