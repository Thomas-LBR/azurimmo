package bts.sio.azurimmo.views  // Vérifie bien ton package


import ContratCard
import LocataireCard
import PaiementCard
import com.example.azurimmo.viewModel.ContratViewModel
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.azurimmo.viewModel.LocataireViewModel
import com.example.azurimmo.viewModel.PaiementViewModel

@Composable
fun PaiementList(viewModel: PaiementViewModel = viewModel()) {
    // Observer les données de manière réactive
    val paiements by viewModel.paiements.collectAsState()

    LazyColumn(
        modifier = Modifier.padding(8.dp)
    ) {
        items(paiements) { paiement ->
            PaiementCard(paiement = paiement)
        }
    }
}
