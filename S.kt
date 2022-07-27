fun main() {
    val token = """
        </LinearLayout>
    """.trimIndent()
    val result = "([a-zA-z_]+)".toRegex().find(token)!!.value
    println(result)
}