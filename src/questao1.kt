fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    print("A + B: ${a + b}\n")
    if (a + b < c)
        print("a soma é menor que C ($c)")
    else if (a + b > c)
        print("a soma é maior que C ($c)")
    else println("a soma é igual a C ($c)")

}