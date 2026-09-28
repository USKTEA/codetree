fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    // Please write your code here.
    println(solve(a, b))    
}

fun solve(a: Int, b: Int): Int {
    val primes = getPrimes(a, b)
    val allOdds = getAllOdds(primes)

    return allOdds.count()
}

fun getAllOdds(primes: List<Int>): List<Int> {
    return primes.filter {
        isAllOdds(it)
    }
}

fun isAllOdds(number: Int): Boolean {
    var current = number
    var result = 0

    while (current / 10 > 0) {
        result += (current / 10)
        current %= 10
    }

    result += current

    return result % 2 == 0
}

fun getPrimes(min: Int, max: Int): List<Int> {
    return buildList {
        (min..max).forEach {
            if (isPrime(it)) {
                add(it)
            }
        }
    }
}

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