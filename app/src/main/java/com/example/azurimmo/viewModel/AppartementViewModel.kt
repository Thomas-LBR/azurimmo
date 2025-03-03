package com.example.azurimmo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bts.sio.azurimmo.model.Appartement
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// ViewModel pour gérer les données des bâtiments
class `AppartementViewModel` : ViewModel() {

    // Liste mutable des bâtiments
    private val _appartements = MutableStateFlow<List<Appartement>>(emptyList())
    val appartements: StateFlow<List<Appartement>> = _appartements

    init {
        // Simuler un chargement de données initiales
        getAppartements()
    }

    // Fonction pour simuler le chargement de bâtiments
    private fun getAppartements() {
        viewModelScope.launch {
            _appartements.value = listOf(
                Appartement(1, "1", "1"),
                Appartement(2, "4", "41"),
                Appartement(3, "7", "73")
            )
        }
    }
}
