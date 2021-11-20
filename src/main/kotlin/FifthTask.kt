fun main(args: Array<String>) {
    val stearsCount = 13
    println(
        "The total number of ways  is "
                + countVariants(stearsCount)
    )
}

fun countVariants(stearsCount: Int): Int {
    val S = intArrayOf(1, 2)

    if (stearsCount == 0) return 1
    if (stearsCount < 0) return 0
    var result = 0
    for (c: Int in S) {
        result += countVariants(stearsCount - c)
    }
    return result
}
