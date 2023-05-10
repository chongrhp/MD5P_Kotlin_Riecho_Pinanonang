package ooppracticeactivities.ooppracticeactivity1_person

class Person {
    var name:String
    var age:Int
    var email:String

    //init block initialization
    init{
        name = "Riecho Pinanonang"
        age = 42
        email = "chongrhp@gmail.com"
    }

    fun printDetails(){
        println("Name: $name")
        println("Age: $age")
        println("Email: $email")
    }
}