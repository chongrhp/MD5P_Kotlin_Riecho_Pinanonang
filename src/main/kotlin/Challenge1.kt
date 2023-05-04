fun main(){
    //Single catch
    var number1:Int = 0
    var number2:Int = 0
    //Exception handling - try and catch block
    while(true){
        try {
            println("********************")
            println("Simple Calculator")
            println("********************")
            print("Enter number 1: ")
            number1 = readln().toInt()
            print("Enter number 2: ")
            number2 = readln().toInt()
            println("The quotient is ${number1/number2}")
            break
        } catch(exception:Exception){
            println("Wrong input! Integer inputs only!")
        }
    }

    println("This is a test")
}