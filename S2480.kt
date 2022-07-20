import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val dices = br.readLine().split(" ").map{ it.toInt() }
    val countArray = List(7) { 0 }.toMutableList()

    for(i in dices) {
        countArray[i]++
    }

    when(Collections.max(countArray)) {
        3 -> println(countArray.indexOf(3) * 1000 + 10000)
        2 -> println(countArray.indexOf(2) * 100 + 1000)
        1 -> println(countArray.lastIndexOf(1) * 100)
    }
}