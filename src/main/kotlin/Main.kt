fun main(args: Array<String>) {
    val fizzBuzzRule: Rule = FizzBuzzRule()
    val player1 = Player(fizzBuzzRule, 1, 100)
    player1.doFizzBuzz()
    player1.print("FizzBuzzResult:")

    val leapYearRule: Rule = LeapYearRule()
    val player2 = Player(leapYearRule, 500, 2000)
    player2.doFizzBuzz()
    player2.print("LeapYearResult:")
}