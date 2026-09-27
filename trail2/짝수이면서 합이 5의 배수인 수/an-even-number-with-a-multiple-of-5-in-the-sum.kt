fun main() {
    val n = readLine()!!.toInt()
    
    // Please write your code here.

    val result = solve(n)

    if (result) {
        println("Yes")
    } else {
        println("No")
    }
}

fun solve(number: Int): Boolean {
    return isEven(number) && sumCanDivideByFive(number)
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun sumCanDivideByFive(number: Int): Boolean {
    if (number >= 10) {
        return (((number / 10) + (number % 10)) % 5) == 0
    }

    return number % 5 == 0
}