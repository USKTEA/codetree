fun main() {
    val (n1, n2) = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }
    // Please write your code here.

    if (solve(a, b)) println("Yes") else println("No")
}

fun solve(numbers: List<Int>, otherNumbers: List<Int>): Boolean {
    if (otherNumbers.size > numbers.size) {
        return false
    }

    if (numbers == otherNumbers) {
        return true
    }

    val current = mutableListOf<Int>()
    var currentIndex = 0

    while (currentIndex <= numbers.lastIndex) {
        if (current.size < otherNumbers.size) {
            current.add(numbers[currentIndex])
            currentIndex += 1

            continue
        }

        if (current.size == otherNumbers.size) {
            if (current == otherNumbers) {
                return true
            }
        }

        current.add(numbers[currentIndex])
        current.removeFirst()

        currentIndex += 1
    }

    return current == otherNumbers
}