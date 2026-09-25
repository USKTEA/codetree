fun main() {
    val (n, m) = readln().split(" ").map { it.toInt() }
    
    // Please write your code here.
    println(lcm(n, m))
}

fun lcm(n: Int, m: Int, divisors: MutableList<Int> = mutableListOf(1)): Int {
    val min = minOf(n, m)

    for (i in divisors.last()..min) {
        if (i == 1) {
            continue
        }

        if (n % i == 0 && m % i == 0) {
            divisors.add(i)
            return lcm(n / i, m / i, divisors)
        }
    }

    return n * m * divisors.reduce { acc, i -> acc * i }
}