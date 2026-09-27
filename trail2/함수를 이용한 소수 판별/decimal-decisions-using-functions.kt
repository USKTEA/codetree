fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val a = input[0]
    val b = input[1]
    // Please write your code here.

    println(solve(a, b))
}

fun solve(min: Int, max: Int): Int {
    return (min..max).sumOf {
        if (isPrime(it)) {
            it
        } else {
            0
        }
    }
}

//10
fun isPrime(number: Int): Boolean {
    if (number <= 2) {
        return true
    }

    var i = 2

    while (i * i <= number) {
        if (number % i == 0) {
            return false
        }

        i += 1
    }

    return true
}