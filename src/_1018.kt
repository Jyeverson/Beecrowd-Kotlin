import java.util.Scanner;
fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    var valor: Int = sc.nextInt()
    println(valor)
    println((valor / 100).toString() + " nota(s) de R$ 100,00")
    valor = valor % 100
    println((valor / 50).toString() + " nota(s) de R$ 50,00")
    valor = valor % 50
    println((valor / 20).toString() + " nota(s) de R$ 20,00")
    valor = valor % 20
    println((valor / 10).toString() + " nota(s) de R$ 10,00")
    valor = valor % 10
    println((valor / 5).toString() + " nota(s) de R$ 5,00")
    valor = valor % 5
    println((valor / 2).toString() + " nota(s) de R$ 2,00")
    valor = valor % 2
    println((valor / 1).toString() + " nota(s) de R$ 1,00")
    sc.close()
}