fun main() {
    val a = readln().toInt()
    val b = readln().toInt()

    val c = if(a == b) a + b else a * b
    println(c)
}