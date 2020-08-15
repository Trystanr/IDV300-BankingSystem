fun main() {

    println("Welcome to the bank")
    println("Enter administrator password:")

    system@while (true) {
        var systemAccess = readLine().toString()
        when (systemAccess) {
            in listOf("123") -> {
                println("Success, logging in now...")
                Bank("Procedure Bank")
                break@system
            }
            in listOf("q", "quit", "exit") -> {
                println("Shutting down...")
                break@system
            }
            else -> {
                println("Incorrect password...")
                println("Enter administrator password:")
                continue@system
            }
        }
    }

}