package br.com.alura

fun testaMapAula3() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 45.0
    )
//    metodo infix 3 to 50.0
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("numero do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(5, 80.0)
//    println("MESMA MANEIRA DO PEDIDO 4 (.PUT)")
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
//    pedidos.putIfAbsent(6, 200.0) "ELE SÒ ADICIONA ALGO SE NÂO EXISTIR"
    pedidos.putIfAbsent(6, 200.0)
    println(pedidos)
    pedidos.putIfAbsent(6, 300.0)
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)
//    pedidos.remove(3, 100.0) "SE CHEGAR AO VALOR AO LADO ELE È REMOVIDO"
    println(pedidos)


}