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