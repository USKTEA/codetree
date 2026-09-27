fun main() {
    val (a, b) = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.
    println(solve(a, b))
}

fun solve(min: Int, max: Int): Int {
    return (min..max).count {
        if (it % 3 == 0) {
            return@count true
        }

        val number = it.toString()
        if (number.contains('3') || number.contains('6') || number.contains('9')) {
            return@count true
        }

        false
    }
}