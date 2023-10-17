package com.pmdm.ud_1_examen_david_de_andres

fun main() {

    println(costePlatos(7.5))

    //imprimo la lista sin modificar
    println(mesas)
    println(gestionarReservas(mesas, 1))

    println(mostrarReserva("Pepe", "20:30", 2, 10, 2023, true))

    procesarReserva()


}
//[2.5] Coste de los platos: recibir el precio de un plato y devolver un texto indicando si es
//caro o barato, según la siguiente relación:
//o Menos de 5€: “€”
//o Entre 5.5€ y 8€: “€€”
//o Entre 8.5€ y 15€: “€€€”
//o Entre 15.5€ y 21.5€: “€€
//o Más de 22€: “€€€€€"

fun costePlatos(input: Double): String {
    when (input) {
        in Double.MIN_VALUE..5.0 -> return "€"
        in 5.5..8.0 -> return "€€"
        in 8.5..15.0 -> return "€€€"
        in 15.5..21.5 -> return "€€€"
        in 22.0..Double.MAX_VALUE -> return "€€€€"
        else -> {
            return "Fuera de rango"
        }
    }
}

//[2.5]Gestionar las reservas: recibir una lista que contenga las mesas libres y el número de
//comensales de la reserva. La lista de mesas libres será un listado de números enteros,
//donde cada valor representa los asientos disponibles de una mesa. Para un restaurante con
//3 mesas de 2 asientos, el listado sería: [2, 2, 2].
//  o La función debe devolver true en caso de que exista una mesa libre con la cantidad
//  exacta de comensales. En ese caso, además, debe eliminar la mesa asignada de la
//  lista.
//  o La función devolverá false en caso contrario.
//NOTA DEL SENIOR: Novato, recuerda que si modificas una lista dentro de una función, el cambio se
//aplica a todo el programa, incluida la función superior

var mesas: MutableList<Int> = mutableListOf(
    2,
    0,
    4,
    2,
    2
)

fun gestionarReservas(mesas: List<Int>, comensales: Int?): Boolean {
    var resultado: Boolean = true

    for ((i, value) in mesas.withIndex()) {
        if (mesas[i] == comensales) {
//            mesas.removeAt(i)
            //mesas.del[i] Esto sería para eliminar esa parte, pero no se hacerlo
            resultado = true
        } else {
            resultado = false
        }
    }
    return resultado
}

//[1] Mostrar reserva: recibir un nombre (texto), una hora (texto), una fecha (en 3 enteros:
//dia, mes y año) y un booleano.
//  o Mostrar un mensaje de confirmación de reserva (estilo libre), incluyendo todos los
//  datos mostrados, en caso de que el booleano sea true.
//  o Mostrar un mensaje de no disponibilidad en caso contrario
fun mostrarReserva(nombre: String?, hora: String?, dia: Int?, mes: Int?, anyo: Int?, bool: Boolean?) {
    if (bool == true) {
        println(nombre + ", su reserva ha sido realizada con éxito para la hora: " + hora + " del " + dia + "/" + mes + "/" + anyo)
    } else {
        println(nombre + ", su reserva NO ha sido realizada con éxito")
    }
}

//[3] Procesar reserva: llama a la función de gestionar reserva y, a continuación, a la función
//mostrar reserva. Esta función recibirá todos los parámetros necesarios para llamar al resto
//de funciones.
//  o Se quiere que estos parámetros admitan el valor null, y por tanto, se debe realizar el
//tratamiento adecuado, antes de llamar a las otras funciones.
//  o En caso de detectar valor null en alguno de los parámetros, se debe devolver un
//mensaje de error, indicando qué parámetro tiene valor null (el mensaje solo
//reportará el primer parámetro null que encuentre).
//  o Si todo funciona correctamente (no se detectan nulls), se debe devolver el texto
//“Reserva procesada”.

fun procesarReserva() {

    var comensales: Int? = 1
    var nombre: String? = "Pepe"
    var hora: String? = "20:30"
    var dia: Int? = 2
    var mes: Int? = 10
    var anyo: Int? = 2023
    var bool: Boolean? = true

    gestionarReservas(mesas, 1)
    mostrarReserva(nombre, hora, dia, mes, anyo, bool)

    when {
        comensales == null -> println("Comensales no puede ser null")
        nombre == null -> println("nombre no puede ser null")
        hora == null -> println("hora no puede ser null")
        dia == null -> println("dia no puede ser null")
        mes == null -> println("mes no puede ser null")
        anyo == null -> println("anyo no puede ser null")
        bool == null -> println("bool no puede ser null")
        else -> println("Reserva procesada")
    }
}
//PRUEBA DE GIT
//PRUEBA 2
