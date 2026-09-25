fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }

    println(gcd(n, m))
}

fun gcd(n: Int, m: Int, divisors: MutableList<Int> = mutableListOf(1)): Int {
    val min = minOf(n, m)
    for (i in divisors.last()..min) {
        if (i == 1) {
            continue
        }

        if (n % i == 0 && m % i == 0) {
            divisors.add(i)
            return gcd(n / i, m / i, divisors)
        }

        if (i == min) {
            return divisors.reduce { acc, i -> acc * i }
        }
    }

    return divisors.reduce { acc, i -> acc * i }
}