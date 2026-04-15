package com.example.gestioncheckin.ui.registro

sealed class RegistroState{
    data object Idle: RegistroState()
    data class Success(val mensaje: String): RegistroState()
    data class Error(val mensaje: String): RegistroState()
}