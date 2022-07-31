fun main() {
    val hash = HashMap<Int, Int>()
    hash[1] = 1
    hash[2] = 2

    print(hash.filter { (k, v) -> k > 1 })
}