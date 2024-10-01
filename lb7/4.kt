import kotlin.random.Random

fun main() {
    println("Добро пожаловать вочко(21)")

    while (true) {
        val deck = createDeck()
        val player = mutableListOf<Int>()
        val dealer = mutableListOf<Int>()

        player.add(drawCard(deck))
        player.add(drawCard(deck))
        dealer.add(drawCard(deck))
        dealer.add(drawCard(deck))

        println("Твои карты: ${player.joinToString(", ")} (сумма: ${sumHand(player)})")
        println("Карта Дилера: ${dealer[0]}")

        while (true) {
            println("Хочешь взять карту? (да/нет)")
            val takeCard = readLine()!!.lowercase()
            if (takeCard == "да") {
                player.add(drawCard(deck))
                println("Ваши карты: ${player.joinToString(", ")} (сумма: ${sumHand(player)})")
                if (sumHand(player) > 21) {
                    println("У тебя перебор. Жадность сгубила.")
                    break
                }
            } else {
                break
            }
        }

        if (sumHand(player) <= 21) {
            // Ход дилера
            while (sumHand(dealer) < 17) {
                dealer.add(drawCard(deck))
                println("Дилер взял карту.")
            }

            println("Карты Дилера: ${dealer.joinToString(", ")} (сумма: ${sumHand(dealer)})")

            if (sumHand(dealer) > 21) {
                println("У Дилера перебор. Ты выйграл.")
            } else {
                if (sumHand(dealer) > sumHand(player)) {
                    println("Дилер выиграл.")
                } else if (sumHand(dealer) < sumHand(player)) {
                    println("Ты выйграл!")
                } else {
                    println("Ничья.")
                }
            }
        }

        println("Сыграем еще? (да/нет)")
        val Again = readLine()!!.lowercase()
        if (Again != "да") {
            break
        }
    }

    println("Алибидерчи!")
}

fun createDeck(): List<Int> {
    val deck = mutableListOf<Int>()
    for (suit in 1..4) {
        for (rank in 2..10) {
            deck.add(rank)
        }
        deck.add(11)
        deck.add(10)
    }
    deck.shuffle()
    return deck
}

fun drawCard(deck: List<Int>): Int {
    return deck.random()
}

fun sumHand(hand: List<Int>): Int {
    var sum = 0
    var hasAce = false
    for (card in hand) {
        if (card == 11) {
            hasAce = true
        }
        sum += card
    }
    // Если есть туз и сумма больше 21, то туз считается за 1
    if (hasAce && sum > 21) {
        sum -= 10
    }
    return sum
}