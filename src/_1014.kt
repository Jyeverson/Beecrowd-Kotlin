import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x: Int = sc.nextInt()
    val y: Double = sc.nextDouble()
    val z = x / y
    System.out.printf("%1.3f km/l", z)
    println()
    sc.close()
}