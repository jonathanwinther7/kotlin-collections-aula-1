package br.com.alura

fun testaMapAula3() {
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 34.0), 3 to 50.0, 4 to 45.0)
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (pedido in pedidos) {
        println("numero do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }
}