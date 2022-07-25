import java.util.Collections.min
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val hamburger = ArrayList<Int>()
    val drink = ArrayList<Int>()
    for(i in 1..3)
        hamburger.add(sc.nextInt())

    for(i in 1..2)
        drink.add(sc.nextInt())

    println(min(hamburger) + min(drink) - 50)
}