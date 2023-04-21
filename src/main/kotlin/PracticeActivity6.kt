fun main(){
    //Initialize variable
    var inputNumber:Int = 0

    //Input variable
    print("\nEnter a number: ")
    inputNumber = readln().toInt()

    //Process and display output
    if (inputNumber > 0 ) {
        println("Then number is positive")
    } else if (inputNumber < 0) {
        println("Then number is negative")
    } else if (inputNumber == 0) {
        println("Then number is zero")
    }
}