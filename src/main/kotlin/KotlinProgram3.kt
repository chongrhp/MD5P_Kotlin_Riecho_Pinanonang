fun main(){
    //implicit variable declaration
    //var name = "Riecho"
    //the declaration is similar to -> var name:String = "Riecho"

    //Input - Process - Output
    //for String input
    println("Enter your name: ")
    var name :String = readln()
    println("Hello $name!!")

    //for Integer input key
    println("Enter a number: ")
    var number : Int = readln().toInt()
    println("You have entered the number $number!")
}