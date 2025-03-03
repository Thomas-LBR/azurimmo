package com.example.azurimmo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bts.sio.azurimmo.model.Contrat
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// ViewModel pour gérer les données des bâtiments
class `ContratViewModel` : ViewModel() {

    // Liste mutable des bâtiments
    private val _contrats = MutableStateFlow<List<Contrat>>(emptyList())
    val contrats: StateFlow<List<Contrat>> = _contrats

    init {
        // Simuler un chargement de données initiales
        getContrats()
    }

    // Fonction pour simuler le chargement de bâtiments
    private fun getContrats() {
        viewModelScope.launch {
            _contrats.value = listOf(
                Contrat(1, "12 mois", "Bien"),
                Contrat(2, "48 mois", "Mauvais"),
                Contrat(3, "172 mois", "Moyen")
            )
        }
    }
}
