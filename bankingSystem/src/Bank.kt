import java.util.function.Consumer

class Bank(val bankName: String):BankSystem() {
    val clients = mutableListOf<Client>()
    val accounts = mutableListOf<Account>()

    val availableActions = listOf("Create Account", "Create Client", "Make Transaction")

    init {
        while (!terminateSystem) {
            setupBank()

            println("Choose an action: ")
            printActions(availableActions)

            var actionChosen = takeBankInput(this, "")

            when (actionChosen) {
                "1" -> {
                    "Create an account"
                    handleCreateAccount()
                }
            }
        }
    }

    fun printActions(actions: List<String>) {
        for((index, action) in actions.withIndex()) println("${index+1} -> ${action}")
    }

    fun handleCreateAccount() {
//        Provides the user prompts for creating an account

        // Get user name
        // Get user ID

    }


    fun addClient(client: Client) {
        clients.add(client)
    }

    fun getAccountsByClient(client: Client): MutableList<Account> {
        var clientAccounts = mutableListOf<Account>()
        for (account in accounts) {
            if (account.userID == client.userID) {
                clientAccounts.add(account)
            }
        }
        return clientAccounts
    }


    private fun setupBank() {
        // Instantiate any accounts, users here

        println("Bank setup complete")
    }




}