import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val array = intArrayOf(0, 0)

    for(i in 1 .. n) {
        array[br.readLine().toInt()]++
    }

    if(array[0] > array[1]) {
        println("Junhee is not cute!")
    } else {
        println("Junhee is cute!")
    }
}