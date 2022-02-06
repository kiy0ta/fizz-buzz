class LeapYearRule : Rule {
    override fun returnTextMatchedRule(number: Int): String {
        if (number <= 0) throw IllegalArgumentException("Not natural number...")
        return if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            "閏年です"
        } else number.toString()
    }
}