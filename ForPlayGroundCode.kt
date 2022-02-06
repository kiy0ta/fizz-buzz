/**
fun main() {
    val fizzBuzzRule: Rule = FizzBuzzRule()
    val player1 = Player(fizzBuzzRule, 1, 100)
    player1.doFizzBuzz()
    player1.print("FizzBuzzResult:")

    val leapYearRule: Rule = LeapYearRule()
    val player2 = Player(leapYearRule, 500, 2000)
    player2.doFizzBuzz()
    player2.print("LeapYearResult:")
}

class Player(private val rule: Rule, private val start: Int, private val end: Int) {
    private var resultTextList = mutableMapOf<Int, String>()

    init {
        if (start > end) throw IllegalArgumentException("{start} must be <= {end}...")
    }

    fun doFizzBuzz() {
        for (i in start..end) {
            val result: String = rule.returnTextMatchedRule(i)
            resultTextList[i] = result
        }
    }

    fun print(ruleName:String){
        println("$ruleName$resultTextList")
    }
}

interface Rule {
    fun returnTextMatchedRule(number:Int):String
}

class FizzBuzzRule : Rule {
    override fun returnTextMatchedRule(number: Int): String {
        if (number % 15 == 0) {
            return "FizzBuzz"
        } else if (number % 5 == 0) {
            return "Buzz"
        } else if (number % 3 == 0) {
            return "Fizz"
        }
        return number.toString()
    }
}

class LeapYearRule : Rule {
    override fun returnTextMatchedRule(number: Int): String {
        if (number <= 0) throw IllegalArgumentException("Not natural number...")
        return if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            "閏年です"
        } else number.toString()
    }
}
*/
