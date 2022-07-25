import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val time = br.readLine().split(" ").map{ it.toInt() }.toIntArray()
    val d = br.readLine().toInt()

    time[2] += d
    time[1] += time[2] / 60
    time[2] %= 60

    time[0] += time[1] / 60
    time[1] %= 60

    if(time[0] >= 24) {
        time[0] %= 24
    }

    println(String.format("%d %d %d", time[0], time[1], time[2]))
}