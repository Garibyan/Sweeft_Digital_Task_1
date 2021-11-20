import java.util.*

//ფუნქციის რეკურსია ძაან კარგად არ მესმის, ამ სოლუშენის ნაწილი ინტერნეტში ვნახე. მეხუთე დავალების შესრულებაშიც გამოვიყენე.

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val coins = intArrayOf(1, 5, 10, 20, 50)

    println("Enter Amount : ")
    val amount: Int = scanner.nextInt()

    println("Minimal number of coins is ${minSplit(coins, amount)}")
}


fun minSplit(coins: IntArray, amount: Int): Int {
    var coinsCounter: Int = Int.MAX_VALUE

    if (amount == 0) return 0

    for (i in 0 until coins.size) {
        if (coins[i] <= amount) {
            val subResult = minSplit(coins, amount - coins[i])
            if (subResult != Int.MAX_VALUE && subResult + 1 < coinsCounter) coinsCounter = subResult + 1
        }
    }
    return coinsCounter
}
