package kotlinoop.kotlinoop1
class Person1C(var name:String,
               var age:Int){
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
    var pedroObject = Person1B("Riecho",21)
    println(pedroObject.name)
    println(pedroObject.age)
    pedroObject.walk()
    pedroObject.sayHellow()
}