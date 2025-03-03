package bts.sio.azurimmo.views  // Vérifie que le package est cohérent

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(
        navController = navController,
        startDestination = "batiments_list",
        modifier = modifier
    ) {
        composable("batiments_list") {
            Text("Page Bâtiments")
        }
        composable("appartements_list") {
            Text("Page Appartements")
        }
        composable("contrats_list") {
            Text("Page Contrats")
        }
        composable("locataires_list") {
            Text("Page Locataires")
        }
        composable("paiements_list") {
            Text("Page Paiements")
        }
    }
}
