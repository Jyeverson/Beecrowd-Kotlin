import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val nota1: Double = sc.nextDouble()
    val nota2: Double = sc.nextDouble()
    val MEDIA: Double
    MEDIA = (nota1 * 3.5 + nota2 * 7.5) / 11
    System.out.printf("MEDIA = %.5f\n", MEDIA)
    sc.close()
}