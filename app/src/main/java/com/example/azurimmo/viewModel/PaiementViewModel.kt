package com.example.azurimmo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bts.sio.azurimmo.model.Paiement
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// ViewModel pour gérer les données des bâtiments
class `PaiementViewModel` : ViewModel() {

    // Liste mutable des bâtiments
    private val _paiements = MutableStateFlow<List<Paiement>>(emptyList())
    val paiements: StateFlow<List<Paiement>> = _paiements

    init {
        // Simuler un chargement de données initiales
        getPaiements()
    }

    // Fonction pour simuler le chargement de bâtiments
    private fun getPaiements() {
        viewModelScope.launch {
            _paiements.value = listOf(
                Paiement(1, "1515", "Carte"),
                Paiement(2, "255154", "Espece"),
                Paiement(3, "156415", "Carte")
            )
        }
    }
}
