package kotlinoop.kotlinoop1
//OOP
//object - represents something in the real world
//class - blueprint of an object
//Structural Programming, Procedural Programming
//-top to bottom

//Person class
//////attributes/properties
//name
//age

//////behaviors
//walk
//eat

class Person{
    //attribute
    var name: String
    var age :Int

    //init block, initialization
    init{
        name="Pedro"
        age=42
    }

    fun walk(){
        println("A person walks")
    }
    fun eat(){
        print("A person eats")
    }
    fun sayHellow(){
        println("$name says Hello!")
    }
}
fun main(){
    //instantiation - creating objects from a class
    var pedroObject = Person()
    println(pedroObject.name)
    pedroObject.sayHellow()
}