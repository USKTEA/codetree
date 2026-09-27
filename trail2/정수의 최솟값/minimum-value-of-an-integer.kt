fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }

    println(minOf(a, b, c))
}

fun minOf(vararg numbers: Int): Int {
    return numbers.reduce { acc, number -> if (acc > number) number else acc }
}