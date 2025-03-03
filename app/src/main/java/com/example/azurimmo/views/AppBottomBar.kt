package bts.sio.azurimmo.views

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController

@Composable
fun AppBottomBar(navController: NavController) {
    val items = listOf(
        BottomNavItem("Bâtiments", "batiments_list", Icons.Filled.Business),
        BottomNavItem("Appts", "appartements_list", Icons.Filled.Home),
        BottomNavItem("Contrats", "contrats_list", Icons.Filled.Description),
        BottomNavItem("Locataires", "locataires_list", Icons.Filled.Person),
        BottomNavItem("Paiements", "paiements_list", Icons.Filled.AttachMoney)
    )

    var selectedItem by remember { mutableStateOf(0) }

    NavigationBar(
        modifier = Modifier.fillMaxWidth()
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(item.icon, contentDescription = item.label) },
                label = { Text(item.label) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route)
                }
            )
        }
    }
}

data class BottomNavItem(val label: String, val route: String, val icon: ImageVector)
