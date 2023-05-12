package ooppracticeactivities.ooppracticeactivity10bankaccount

class BankAccount {
    var accountNumber: String
    var accountBalance: Double

    constructor(accNum:String){
        this.accountNumber = accNum
        this.accountBalance = 0.0
    }

    constructor(accNumber:String, accBal: Double){
        this.accountNumber = accNumber
        this.accountBalance = accBal
    }
}