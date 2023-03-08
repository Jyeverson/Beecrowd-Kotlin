import java.util.Scanner
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val numerofuncionario = sc.nextInt()
    val horastrabalhadas = sc.nextInt()
    val valorporhora = sc.nextDouble()
    println("NUMBER = $numerofuncionario")
    System.out.printf("SALARY = U$ %.2f", horastrabalhadas * valorporhora)
    println()
    sc.close()
}