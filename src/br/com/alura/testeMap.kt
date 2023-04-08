package br.com.alura

fun testaMapAula3() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0,
        4 to 100.0,
        5 to 100.0,
        6 to 80.0
        //    metodo infix 3 to 50.0
    )
//    val valorPedido = pedidos.getValue(4) "SE O GETVALUE NÂO EXISTE ELE TRAS UMA EXCEPTION"
//    println(pedidos[0])
    val Mensagem = pedidos.getOrElse(3,
        {
            "Não tem o pedido"
        })
//    """SE NAO TIVER A KEY ELE DEVOLVE A EXPRESSÂO LAMBIDA"""
    println(Mensagem)
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    println(pedidos.keys)

    for (numeros in pedidos.keys) {
        println("Pedido $numeros")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }
    println(pedidosAcima)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6, 5))
    println(pedidos)

//    pedidos.putAll(listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0)) " FAZ A MESMA COISA QUE += "

    pedidos += listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    println(pedidos + (7 to 90))

}

