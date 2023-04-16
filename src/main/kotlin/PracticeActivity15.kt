fun main(){
    //initialize variables
    var number1:Int = 0
    var number2:Int = 0
    var number3:Int = 0

    //Input variables
    print("Enter number 1: ")
    number1 = readln().toInt()
    print("Enter number 2: ")
    number2 = readln().toInt()
    print("Enter number 3: ")
    number3 = readln().toInt()

    //Check arguments and display output
    if(((number1 * number1) + (number2 * number2)) == (number3 * number3)) {
        println("These numbers form a Pythagorean triple")
    } else {println("These numbers do not form a Pythagorean triple")}
}