fun main() {
    println("Calculadora de Média Escolar")
    println("Digite a quantidade de notas:")
    val quantidadeNotas = readLine()!!.toInt()

    // Recebendo as notas
    val notas = mutableListOf<Double>()
    repeat(quantidadeNotas) {
        println("Digite a nota ${it + 1}:")
        val nota = readLine()!!.toDouble()
        notas.add(nota)
    }

    // Calculando a média
    val media = notas.average()

    // Imprimindo o resultado
    println("A média das notas é: $media")
}
