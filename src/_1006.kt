import java.util.Scanner;

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val nota1 = sc.nextDouble()
    val nota2 = sc.nextDouble()
    val nota3 = sc.nextDouble()
    val MEDIA: Double
    MEDIA = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10
    System.out.printf("MEDIA = %.1f\n", MEDIA)
    sc.close()
}