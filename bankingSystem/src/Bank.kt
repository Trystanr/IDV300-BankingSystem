import java.util.function.Consumer

class Bank(val bankName: String) {
    val clients = mutableListOf<Client>()
    val accounts = mutableListOf<Account>()

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
}