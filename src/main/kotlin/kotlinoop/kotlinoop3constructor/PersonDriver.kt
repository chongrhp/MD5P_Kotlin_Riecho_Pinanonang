package kotlinoop.kotlinoop3constructor

fun main(){
    //1st constructor
    println("First Constructor")
    val person1 = Person()
    println(person1.name)
    println(person1.age)

    println("Second Constructor")
    val person2 = Person("Peter", 21)
    println(person2.name)
    println(person2.age)

    println("Third Constructor")
    val person3 = Person("Riecho")
    println(person3.name)
    println(person3.age)
    person3.age = 42
    println(person3.age)

    println("fourth Constructor")
    val person4 = Person(10)
    println(person4.name)
    println(person4.age)
}