package kotlinoop.kotlinoop8encapsulation
fun main(){
    var person = Person()
    person.setName("Peter")
    person.setAge(21)

    println(person.getName())
    println(person.getAge())
}