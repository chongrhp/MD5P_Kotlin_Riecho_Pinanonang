fun main(){
    var names = mapOf("Alice" to "555-1234","Boboy" to "555-5678","Charlie" to "555-9101")
    var name:String = ""

    println("\nName\t\t\tPhone number")
    for((id, element) in names){
        println("$id\t\t\t$element")
    }

    print("\nWhat is the name? ")
    name = readln()
    println("$name's phone number is ${names[name]}")
}