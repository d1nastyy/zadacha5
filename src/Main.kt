fun main() {
    println("Введите число n:")
    val n = readLine()!!.toInt()
    println("Введите основание степени x:")
    val x = readLine()!!.toInt()

    var y = 0
    var currentPower = 1

    while (currentPower < n) {
        y++
        currentPower *= x
    }

    if (currentPower == n) {
        println("Целочисленный показатель степени: $y")
    } else {
        println("Целочисленный показатель не существует")
    }
}
