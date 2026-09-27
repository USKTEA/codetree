fun main() {
    val y = readLine()!!.toInt()
    // Please write your code here.

    println(solve(y))
}

fun solve(year: Int) : Boolean {
    return isLeapYear(year)
}
    
fun isLeapYear(year: Int): Boolean {
    if (year % 4 != 0) {
        return false
    }
    
    if (year % 100 == 0 && year % 400 != 0) {
        return false
    }
    
    return true
}