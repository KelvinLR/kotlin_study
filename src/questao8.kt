fun main() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()

    if (a >= b && a >= c) {
        if (b >= c) {
            println("$c $b $a")
        } else {
            println("$b $c $a")
        }
    } else if (b >= a && b >= c) {
        if (a >= c) {
            println("$c $a $b")
        } else {
            println("$a $c $b")
        }
    } else {
        if (a >= b) {
            println("$b $a $c")
        } else {
            println("$a $b $c")
        }
    }
}
