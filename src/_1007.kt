import java.util.Scanner

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val A = sc.nextInt()
    val B = sc.nextInt()
    val C = sc.nextInt()
    val D = sc.nextInt()
    val DIFERENCA: Int
    DIFERENCA = A * B - C * D
    println("DIFERENCA = $DIFERENCA")
    sc.close()
}