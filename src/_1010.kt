import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val codgPa: Int = sc.nextInt()
    val numberPa: Int = sc.nextInt()
    val pricePa: Double = sc.nextDouble()
    val codgPb: Int = sc.nextInt()
    val numberPb: Int = sc.nextInt()
    val pricePb: Double = sc.nextDouble()
    val resultado = numberPa * pricePa + numberPb * pricePb
    System.out.printf("VALOR A PAGAR: R$ %.2f", resultado)
    println()
    sc.close()
}