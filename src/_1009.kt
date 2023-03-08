import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val Name = sc.next()
    val salarioFixo = sc.nextDouble()
    val vendas = sc.nextDouble()
    val total = vendas * 15 / 100 + salarioFixo
    println(String.format("TOTAL = R$ %.2f", total))
    sc.close()
}