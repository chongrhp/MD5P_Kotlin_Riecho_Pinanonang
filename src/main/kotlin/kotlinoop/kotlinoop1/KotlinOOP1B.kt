package kotlinoop.kotlinoop1
class Person1B(name:String, age:Int){//constructor - for setting attribute values
    var name:String
    var age:Int

    //init block, initialization
    init{
        this.name=name
        this.age=age
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
    var pedroObject = Person1B("Ringo",21)
    println(pedroObject.name)
    println(pedroObject.age)
    pedroObject.sayHellow()
}