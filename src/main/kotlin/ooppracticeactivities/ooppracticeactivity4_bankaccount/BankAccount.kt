package ooppracticeactivities.ooppracticeactivity4_bankaccount

class BankAccount(accNum: String ) {
    var acctNumber: String
    var balance:Double

    init{
        this.acctNumber = accNum
        this.balance = 0.0
    }

    fun deposit(amount:Double){
        this.balance += amount
    }

    fun widthraw(amount:Double){
        this.balance -= amount
    }

    fun getBalance(){
        println("Your balance is: ${this.balance}")
    }
}