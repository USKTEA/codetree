fun main() {
    val (rowNum, colNum) = readln().split(" ").map { it.toInt() }

    repeat(rowNum) {
        val string = buildString {
            repeat(colNum) {
                append("1")
            }
        }
        println(string)
    }
}