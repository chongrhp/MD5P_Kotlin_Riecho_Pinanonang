fun main(){
    //final cath
    var number1:Int = 0
    var number2:Int = 0
    //Exception handling - try and catch block
    try {
        //file.open()
        println("********************")
        println("Simple Calculator")
        println("********************")
        print("Enter number 1: ")
        number1 = readln().toInt()
        print("Enter number 2: ")
        number2 = readln().toInt()

        println("The quotien is ${number1/number2}")

    } catch(exception:Exception){
        println("Wrong input! Integer inputs only!")
    } finally {
        //file.close()
        println("This always executes")
    }

    println("This is a test")
}