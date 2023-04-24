fun main(){
    //Declare variables
    var names = mapOf("Alice" to "555-1234","Boboy" to "555-5678","Charlie" to "555-9101")
    var name:String = "Alice"

    //Display header and elements
    println("\nName\t\t\tPhone number")
    for((id, element) in names){
        println("$id\t\t\t$element")
    }

    //read the name and display specific element
    print("\nWhat is the name? ")
    name = readln()
    println("$name's phone number is ${names[name]}")
}