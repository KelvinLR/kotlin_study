import kotlin.math.pow

fun main() {
    val peso = readln().toFloat()
    val altura = readln().toFloat()

    val imc = peso/altura.pow(2)

    if(imc < 18.5)
        println("Abaixo do Peso")
    else if(imc in 18.6..24.9)
        println("Peso ideal (parabéns)")
    else if(imc in 25.0..29.9)
        println("Levemente acima do peso")
    else if(imc in 30.0..34.9)
        println("Obesidade grau I")
    else if(imc in 35.0..39.9)
        println("Obesidade grau II (severa)")
    else if(imc >= 40)
        println("Obesidade grau III (mórbida)")
}