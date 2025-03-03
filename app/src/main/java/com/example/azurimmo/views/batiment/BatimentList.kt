package bts.sio.azurimmo.views  // Vérifie bien ton package

import BatimentCard
import BatimentViewModel
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun BatimentList(viewModel: `BatimentViewModel` = viewModel()) {
    // Observer les données de manière réactive
    val batiments by viewModel.batiments.collectAsState()

    LazyColumn(
        modifier = Modifier.padding(8.dp)
    ) {
        items(batiments) { batiment ->
            BatimentCard(batiment = batiment)
        }
    }
}
