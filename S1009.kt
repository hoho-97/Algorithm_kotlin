import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val t = br.readLine().toInt()

    for(i in 0 until t) {
        val nums = br.readLine().split(" ").map{ it.toInt() }
        val a = nums[0]
        val b = nums[1]
        var ans = 1
        for(j in 0 until b) {
            ans *= a
            ans %= 10
        }
        if(ans == 0) {
            ans = 10
        }
        println(ans)
    }
}