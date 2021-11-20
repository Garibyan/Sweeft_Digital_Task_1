import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Enter String : ")
    val inputString: String = scanner.nextLine()
    println(
        "$inputString  " +
                if (isProperly(inputString)) "- passed bracket validation"
                else "- didn't passed bkacket validation"
    )
}

fun isProperly(sequence: String): Boolean {
    if (sequence.isEmpty()) return true
    var counter = 0
    for (char in sequence.toCharArray()) {
        when (char) {
            '(' -> counter++
            ')' -> counter--
            else -> return false
        }
        if (counter < 0) return false
    }
    return counter == 0
}