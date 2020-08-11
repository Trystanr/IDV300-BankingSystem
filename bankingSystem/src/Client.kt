class Client(name: String) : User(name) {

    private val accounts = mutableListOf<Account>()

    // Add account to client
    fun addAccount(account: Account) {
        accounts.add(account)
    }

    // Delete account from client
    fun deleteAccount(account: Account) {

    }

    fun getAccounts(): MutableList<Account> {
        return accounts
    }
}