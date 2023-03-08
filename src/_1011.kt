import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val PI = 3.14159
    val R: Double = sc.nextInt()
    val volume = 4 / 3.0 * PI * (R * R * R)
    System.out.printf(String.format("VOLUME = %.3f", volume))
    println()
    sc.close()
}