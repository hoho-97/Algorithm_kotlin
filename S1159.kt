import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val n = br.readLine().toInt()
    val map = HashMap<Char?, Int?>()
    var char : Char
    for(i in 0 until n) {
        char = br.readLine()[0]
        map[char] = map.getOrDefault(char, 0)!! + 1
    }

    var ans = ""

    for((k, v) in map) {
        if(v!! > 4) ans += k
    }

    if(ans == "") println("PREDAJA")
    else println(ans)
}