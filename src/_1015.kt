import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val x1: Double = sc.nextDouble()
    val y1: Double = sc.nextDouble()
    val x2: Double = sc.nextDouble()
    val y2: Double = sc.nextDouble()
    val content = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)
    val distance = Math.sqrt(content)
    System.out.printf("%.4f\n", distance)
    sc.close()
}