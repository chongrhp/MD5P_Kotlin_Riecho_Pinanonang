package kotlinprogram

fun main(){
        //multiple catch
    var number1:Int = 0
    var number2:Int = 0
    //Exception handling - try and catch block
    try {
        println("********************")
        println("Simple Calculator")
        println("********************")
        print("Enter number 1: ")
        number1 = readln().toInt()
        print("Enter number 2: ")
        number2 = readln().toInt()

        println("The quotien is ${number1/number2}")

    } catch(exception:NumberFormatException){
        println("NumberFormatException")
        println("Wrong input! Integer inputs only!")
    } catch(exception:ArithmeticException){
        println("ArithmeticException")
        println("Wrong input! Integer inputs only!")
    }

    println("This is a test")
}