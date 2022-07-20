import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var num = 0
    var sum = 0
    var min = 100

    for(i in 0..6) {
        num = Integer.parseInt(br.readLine())

        if(num % 2 == 1) {
            sum += num

            if(num < min) {
                min = num
            }
        }
    }

    if(sum != 0) {
        println(sum)
        println(min)
    } else {
        println(-1)
    }
}