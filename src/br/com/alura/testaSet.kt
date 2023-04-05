package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Alex", "Fran", "Gui", "Maria")
    val assistiramCursoKotlin: Set<String> = setOf("Alex", "Maria", "Paulo")
    //    val assistiramAmbos: Set<String> = assistiramCursoAndroid.plus(assistiramCursoKotlin)
    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    assistiramAmbos.add("Ana")
    assistiramAmbos.add("juliete")
    println(assistiramAmbos)

    assistiramAmbos.remove("juliete")
    println(assistiramAmbos)
    println(assistiramCursoKotlin intersect assistiramCursoAndroid)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}