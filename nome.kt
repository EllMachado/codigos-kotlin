fun main() {
    val nomes = listOf("Ana", "Carlos", "Beatriz")
    val sobrenomes = listOf("Silva", "Santos", "Oliveira")

    // Sorteia um nome e um sobrenome aleatoriamente
    val nomeSorteado = nomes.random()
    val sobrenomeSorteado = sobrenomes.random()

    println("Nome completo aleatório: $nomeSorteado $sobrenomeSorteado")
}