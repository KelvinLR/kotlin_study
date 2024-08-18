fun main() {
    val num = readln().toInt()

    if (num < 0)
        println("numero negativo")
    else if (num > 0)
        println("numero positivo")
    else
        println("zero")

    if (num % 2 == 0)
        println("numero par")
    else
        println("numero ímpar")
}