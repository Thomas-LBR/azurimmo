package com.example.azurimmo.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bts.sio.azurimmo.model.Locataire
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

// ViewModel pour gérer les données des locataire
class `LocataireViewModel` : ViewModel() {

    // Liste mutable des locataire
    private val _locataires = MutableStateFlow<List<Locataire>>(emptyList())
    val locataires: StateFlow<List<Locataire>> = _locataires

    init {
        // Simuler un chargement de données initiales
        getLocataires()
    }

    // Fonction pour simuler le chargement de bâtiments
    private fun getLocataires() {
        viewModelScope.launch {
            _locataires.value = listOf(
                Locataire(1, "Lebrun", "Thomas"),
                Locataire(2, "Meurda", "Leo"),
                Locataire(3, "MahiMoussa", "Issam")
            )
        }
    }
}
