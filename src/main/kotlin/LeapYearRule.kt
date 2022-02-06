class LeapYearRule : Rule {
    override fun returnTextMatchedRule(number: Int): String {
        return if (number % 4 == 0 && number % 100 != 0 || number % 400 == 0) {
            "閏年です"
        } else number.toString()
    }
}