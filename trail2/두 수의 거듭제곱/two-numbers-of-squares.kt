fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }

    var current = b
    var result = 1

    while (current > 0) {
        result = result * a
        current -= 1
    }

    println(result)
}