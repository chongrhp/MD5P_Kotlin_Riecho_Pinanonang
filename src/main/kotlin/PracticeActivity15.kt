fun main(){
    //initialize variables
    var number1:Int = 0
    var number2:Int = 0
    var number3:Int = 0
    var leftNum:Int = 0
    var rightNum:Int = 0

    //Input variables
    print("\nEnter number 1: ")
    number1 = readln().toInt()
    print("Enter number 2: ")
    number2 = readln().toInt()
    print("Enter number 3: ")
    number3 = readln().toInt()

    //process values
    leftNum = (number1 * number1) + (number2 * number2)
    rightNum = number3 * number3

    //Check arguments and display output
    if( leftNum == rightNum) {
        println("\nThese numbers form a Pythagorean triple")
    } else {
        println("These numbers do not form a Pythagorean triple")
    }
}