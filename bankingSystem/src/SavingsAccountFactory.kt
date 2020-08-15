import java.lang.Exception

class SavingsAccountFactory {

    fun createAccount(type: SavingsAccountType) : SavingsAccount = when (type) {
        SavingsAccountType.TAXFREE -> {
            SavingsAccount(40.00f, 0.12f)
        }
        else -> throw Exception("Did not specify valid account type")
    }
}