import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val A: Int = sc.nextInt()
    val B: Int = sc.nextInt()
    val C: Int = sc.nextInt()
    val maiorAB = (A + B + Math.abs(A - B)) / 2
    val maiorBC = (maiorAB + C + Math.abs(maiorAB - C)) / 2
    System.out.printf("$maiorBC eh o maior\n")
    sc.close()
}