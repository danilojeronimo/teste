fun main() {
    // Mapa de taxas de conversão para cada moeda
    val taxas = mapOf(
        Pair("BRL", 1.0),
        Pair("USD", 4.95),
        Pair("EUR", 5.38)
    )

    // Mostrar a lista de moedas disponíveis
    println("Moedas disponíveis:")
    taxas.forEach { (codigo, nome) ->
        println("$codigo - $nome")
    }

    // Selecionar a moeda inicial
    println("Selecione a moeda inicial:")
    val moedaInicial = readLine()!!.toUpperCase()

    // Selecionar a moeda final
    println("Selecione a moeda final:")
    val moedaFinal = readLine()!!.toUpperCase()

    // Receber a quantia a ser convertida
    println("Digite a quantia a ser convertida:")
    val quantia = readLine()!!.toDouble()

    // Calcular o valor convertido
    val valorConvertido = quantia * (taxas[moedaFinal]!! / taxas[moedaInicial]!!)

    // Mostrar o valor convertido
    println("O valor convertido é: $valorConvertido $moedaFinal")
}
