package practiceactivities

fun main(){
    //initialize variable
    var inputNumber:Int = 0

    //Input variables
    print("\nEnter a number: ")
    inputNumber = readln().toInt()

    //process and display output
    if(inputNumber % 2 == 0) {
        println("\nThe number is even")
    } else {
        println("\nThe number is odd")
    }
}