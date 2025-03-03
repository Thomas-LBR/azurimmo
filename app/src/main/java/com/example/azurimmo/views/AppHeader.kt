package bts.sio.azurimmo.views  // Vérifie bien que le package est correct

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment  // Import nécessaire pour centrer le texte
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun AppHeader() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
            .padding(vertical = 16.dp)
    ) {
        Text(
            text = "Azurimmo",  // Nom de l'application
            style = MaterialTheme.typography.titleLarge.copy(
                color = Color.White,  // Texte blanc sur fond bleu
                fontWeight = FontWeight.Bold
            ),
            modifier = Modifier.align(Alignment.Center)  // Correction ici
        )
    }
}
