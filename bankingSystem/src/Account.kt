open class Account {
    val userID = 0
    var balance: Float = 0f

    val transactionFee = 0f

    fun addFunds(amount: Float) {
        balance += amount
    }

    fun withdraw(amount: Float): Float {
        return if ((balance-amount) >= 0) {
            balance-amount
        } else {
            // Amount is more than in account
            -1f;
        }
    }
}