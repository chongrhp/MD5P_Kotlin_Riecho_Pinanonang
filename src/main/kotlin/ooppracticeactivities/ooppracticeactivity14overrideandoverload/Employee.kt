package ooppracticeactivities.ooppracticeactivity14overrideandoverload

open class Employee {
    var name:String
    var age:Int
    var role:String

    constructor(){
        name = "Default name"
        age = 0
        role = "Administrator"
    }


    constructor(name:String, age:Int){
        this.name = name
        this.age = age
        this.role = "Administrator"
    }

    open fun displayInfo(){
        println("Name: $name")
        println("Age: $age")
        println("Role: $role")
    }
}