fun main(args: Array<String>) {
    val numbers = arrayOf(1, 13, 2, 5, 3, 7, 53, 8, 21, 16)
    print(notContains(numbers))
}

fun notContains(numbersArray: Array<Int>): Int {
    var result: Int = 1
    for (i in 1..Int.MAX_VALUE) {
        if (!numbersArray.contains(i)) {
            result = i
            break
        }
    }
    return result
}