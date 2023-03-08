import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val pi = 3.14159
    val raio = sc.nextLine().trim().toDouble()
    val area = pi * raio * raio

    println("A=%.4f".format(area))
}