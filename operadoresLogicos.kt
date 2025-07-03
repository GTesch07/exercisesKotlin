fun main(){
    println("Insira sua primeira nota: ")
    val nota1 = readLine()!!.toDouble()
    println("Insira sua segunda nota: ")
    val nota2 = readLine()!!.toDouble()

    val media = (nota1 + nota2) / 2

    if (media >= 6){
        println("Parabens, você passou!")
    }else{
        println("Que pena, você reprovou!")
    }
    println("Sua média fou $media")
}