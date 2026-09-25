fun main() {
    val n = readLine()!!.toInt()
        var count = 1

        repeat(n) {
            val string = buildString {
                repeat(n) {
                    append(count % 10)
                    append(" ")
                    count += 1

                    if (count == 10) {
                        count = 1
                    }
                }
            }
            println(string)
        } 
}