package com.example.gestioncheckin.logic

import com.example.gestioncheckin.data.Asistente

//Extension function edad
fun Int.esMayorEdad(): Boolean = this>=18

//Extension function nombre
fun String.nombreValido(): Boolean = this.isNotBlank()

//Higher function
fun descuentoReserva(asistente: Asistente, validacion: (Asistente)->Boolean): String {

    return if (validacion(asistente)){
        "Aplicar descuento"
    }else{
        "No aplica descuento"
    }

}

