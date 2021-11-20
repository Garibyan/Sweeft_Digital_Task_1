import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    println("Enter String : ")
    val string: String = scanner.nextLine()

    println(
        "$string  " +
                if (isPalindrome(string)) "- is a Palindrome "
                else "- is not a Palindrome"
    )
}

fun isPalindrome(string: String): Boolean {
    val stringBuilder = StringBuilder(string)
    val revesedString = stringBuilder.reverse().toString()
    return string.equals(revesedString, ignoreCase = true)
}

