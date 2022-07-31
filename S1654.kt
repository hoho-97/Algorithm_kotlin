import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val lengths = br.readLine().split(" ").map{ it.toInt() }

    val k = lengths[0]
    val n = lengths[1]
    val cables = ArrayList<Int>()

    for(i in 1..k) {
        cables.add(br.readLine().toInt())
    }
    var tail = 0L
    cables.sort()
    var head = cables.last().toLong() + 1L
    var cableCount : Long
    var mid : Long
    while(true) {
        if(tail >= head) break
        cableCount = 0
        mid = (head + tail) / 2

        cables.forEach {
            cableCount += it / mid
        }

        if(cableCount >= n) {
            tail = mid + 1
        } else {
            head = mid
        }
    }

    println(tail - 1)
}