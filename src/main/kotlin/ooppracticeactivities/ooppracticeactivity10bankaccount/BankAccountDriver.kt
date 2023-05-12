package ooppracticeactivities.ooppracticeactivity10bankaccount

fun main(){
    val riechoAccount = BankAccount("02392043")
    println("**** Constructor for Bank Account 1")
    println("Account Number: ${riechoAccount.accountNumber}")
    println("Account Balance: $${riechoAccount.accountBalance}")
    println()
    val airenAccount = BankAccount("06829833",1000.00)
    println("**** Constructor for Bank Account 2")
    println("Account Number: ${airenAccount.accountNumber}")
    println("Account Balance: $${String.format("%,.2f",airenAccount.accountBalance)}")
}