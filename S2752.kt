import java.io.BufferedReader
import java.io.InputStreamReader

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val numbers = br.readLine().split(" ").map{ it.toInt() }

    val nums = numbers.sorted()
    println("${nums[0]} ${nums[1]} ${nums[2]}")
}