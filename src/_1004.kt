import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val A: Int
    val B: Int
    val PROD: Int
    A = sc.nextInt()
    B = sc.nextInt()
    PROD = A * B
    println("PROD = $PROD")
    sc.close()
}
