fun main() {
    val number = readLine()!!.toInt()
    
    if (number % 2 == 0) {
        println(((number / 2) * (number + 1)) / 10)
        return
    }

    println((((number / 2) * (number + 1)) + (number / 2 + 1)) / 10)
}