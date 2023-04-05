package br.com.alura

fun main() {
    val assistiramCursoAndroid = listOf<String>("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin = listOf<String>("Alex", "Guia", "Paulo")
    val assistiramAmbos = assistiramCursoKotlin+ assistiramCursoAndroid
    println(assistiramAmbos.distinct())

}