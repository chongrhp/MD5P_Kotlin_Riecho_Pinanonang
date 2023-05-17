package ooppracticeactivities.ooppracticeactivity14

open class Employee {
    var name:String
    var age:Int

    constructor(){
        name = "Default name"
        age = 0
    }

    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }

    open fun displayInfo(){
        println("Name: $name")
        println("Age: $age")
    }
}