package br.com.alura

fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 10.0),
        Pedido(3, 30.0),
        Pedido(4, 40.0),
        Pedido(5, 60.0),
        Pedido(6, 120.0)
    )
    println(pedidos)
    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido -> pedido.numero }

    println(pedidosMapeados)
    println(pedidosMapeados[5])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }


    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(5, 60.0)])

//    val mapa: Map<Boolean, Pedido> = pedidos.associateBy { pedidos ->
//        pedidos.valor > 50.0
//    }
//    println(mapa)

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> =
        pedidos.groupBy { pedido: Pedido ->
            pedido.valor > 50.0
        }

    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nome = listOf(
        "Alex",
        "Fran",
        "Ana",
        "Maria",
        "Mario",
        "Paulo",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nome.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)