fun main(){
    //initialize variables
    var name:String = ""
    var currentYear:Int = 0
    var birthYear:Int = 0
    var age:Int = 0

    //Input variables
    print("\nWhat is your name? ")
    name = readln()
    print("Enter current year: ")
    currentYear = readln().toInt()
    print("Enter birth year: ")
    birthYear = readln().toInt()

    //process age value
    age = currentYear - birthYear

    //Display output
    println("\n$name, your age on $currentYear is $age")
}