import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val A = sc.nextDouble()
    val B = sc.nextDouble()
    val C = sc.nextDouble()
    val PI = 3.14159
    val AT = A * C / 2
    val AC = PI * (C * C)
    val ATR = (A + B) * C / 2
    val AQ = B * B
    val AR = A * B
    System.out.printf(String.format("TRIANGULO: %.3f", AT))
    println()
    System.out.printf(String.format("CIRCULO: %.3f", AC))
    println()
    System.out.printf(String.format("TRAPEZIO: %.3f", ATR))
    println()
    System.out.printf(String.format("QUADRADO: %.3f", AQ))
    println()
    System.out.printf(String.format("RETANGULO: %.3f", AR))
    println()
    sc.close()
}