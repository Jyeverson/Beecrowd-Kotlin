import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val km: Int = sc.nextInt()
    val minutos = 60 * km / 30
    println("$minutos minutos")
    sc.close()
}