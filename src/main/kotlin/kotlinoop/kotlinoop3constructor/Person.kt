package kotlinoop.kotlinoop3constructor

class Person {
    var name:String
    var age:Int

    constructor(){
        //primary constructor
        name = "Default name"
        age = 0
    }

    //secondary constructor
    constructor(name:String, age:Int){
        this.name = name
        this.age = age

    }

    constructor(name:String){
        this.name = name
        this.age = 0
    }

    constructor(age:Int){
        this.name = "John"
        this.age = age
    }
}