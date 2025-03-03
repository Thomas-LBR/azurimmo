package bts.sio.azurimmo.views  // Vérifie que c'est le bon package

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import bts.sio.azurimmo.views.AppBottomBar
import bts.sio.azurimmo.views.AppHeader
import bts.sio.azurimmo.views.AppNavigation  // Assure-toi d’avoir cette importation

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        topBar = { AppHeader() }, // En-tête de l'application
        bottomBar = { AppBottomBar(navController) } // Barre de navigation en bas
    ) { innerPadding ->
        // Contenu principal de l'écran
        AppNavigation(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}
