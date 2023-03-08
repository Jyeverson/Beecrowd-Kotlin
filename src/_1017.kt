import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val a: Double
    val b: Double
    val r: Double
    a = sc.nextDouble()
    b = sc.nextDouble()
    r = a * b / 12
    System.out.printf("%.3f\n", r)
    sc.close()
}