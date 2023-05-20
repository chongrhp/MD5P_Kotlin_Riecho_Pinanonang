package casestudy.casestudyoop2

open class User {
    var name:String
    var email:String

    init{
        name = "Default name"
        email = "email addres"
    }
    fun displayUser(){
        println("Name: $name")
        println("Email: $email")
    }

}