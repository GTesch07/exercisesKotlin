fun main(){
   
    // 1. Cria uma lista mutável com algumas frutas iniciais.
    val frutas = mutableListOf("Banana", "Maçã", "Laranja", "Melancia")
    println("Lista de frutas inicial: $frutas")

    // 2. Pede ao usuário para digitar uma nova fruta.
    println("\nDigite o nome de uma fruta para adicionar à lista:")
    val novaFruta = readLine()

    // 3. Adiciona a fruta à lista se a entrada não for nula ou vazia.
    // A verificação !.isNullOrBlank() é uma boa prática para evitar adicionar entradas vazias.
    
    if (!novaFruta.isNullOrBlank()) {
        frutas.add(novaFruta)
        println("\n'${novaFruta}' foi adicionada com sucesso!")
        println("Lista de frutas atualizada: $frutas")
    } else {
        println("\nNenhuma fruta foi adicionada.")
    }
}