// A function that helps with taking correct inputs from user
fun takeBankInput(context: BankSystem, message:String): String{
    println(message)
    val userInput = readLine().toString()
    var value: String = ""
    when{
        userInput in listOf("q", "quit", "exit") -> {
            println("Terminating System...")
            context.terminateSystem = true
        }
        userInput.isEmpty() -> {
            takeBankInput(context, message)
        }
        else -> {
            value = userInput
        }
    }
    return value
}