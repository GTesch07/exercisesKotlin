
fun main(){
    println("Qual o seu nome?")
    val nome = readLine()
    println("Qual a sua idade?")
    val idade = readLine()?.toInt()
    println("Olá, $nome. Você tem $idade anos.")
}
