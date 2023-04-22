package practiceactivities

fun main(){
    //initialize variables
    var num1:Int = 0
    var num2:Int = 0
    var num3:Int = 0
    var smallestNumber:Int = 0

    //Input variables
    print("\nEnter number 1: ")
    num1 = readln().toInt()
    print("Enter number 2: ")
    num2 = readln().toInt()
    print("Enter number 3: ")
    num3 = readln().toInt()

    //process argument
    if(num1 < num2 && num1 < num3){
        smallestNumber = num1
    } else if (num2 < num3) {
        smallestNumber = num2
    } else {
        smallestNumber = num3
    }

    //display output
    println("The smallest number is $smallestNumber")
}