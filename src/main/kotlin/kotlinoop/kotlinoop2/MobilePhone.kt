package kotlinoop.kotlinoop2

import java.time.LocalDate

class MobilePhone(var load:Int) {
    var messageLogs = mutableListOf<String>()
    var textMessageCount:Int = 0

    fun sendTextMessage(message:String){
        load--
        textMessageCount++
        println("Message Sent!")
        messageLogs.add("Message: $message, ${System.currentTimeMillis()}")
        println(LocalDate.now())
    }

    fun load(amount:Int){
        load+= amount
        println("Loaded Successfully!")
    }

    fun checkBalance(){
        println("Your account balance is $load")
    }

    fun displayLogs(){
        println("Number of text message sent: $textMessageCount")
        print(messageLogs)
    }
}