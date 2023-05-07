package practiceactivities

fun main(){
    try {
        print("Enter the first number: ")
        var number1 = readln().toInt()
        print("Enter the second number: ")
        var number2 = readln().toInt()

        var sum = { num1: Int, num2: Int -> num1 + num2 }
        if(sum(number1,number2) < 0) throw Exception()
        println("The sum of first and second numbers is ${sum(number1, number2)}")

        var difference = { num1: Int, num2: Int -> num1 - num2 }
        if(difference(number1,number2) < 0) throw Exception()
        println("The difference of first and second numbers is ${difference(number1, number2)}")

        var product = { num1: Int, num2: Int -> num1 * num2 }
        if(product(number1,number2) < 0) throw Exception()
        println("The product of first and second numbers is ${product(number1, number2)}")

        var quotient = { num1: Int, num2: Int -> num1 / num2 }
        if(quotient(number1,number2) < 0) throw Exception()
        println("The quotient of first and second numbers is ${quotient(number1, number2)}")
    } catch (e:ArithmeticException) {
        println("Error message: ${e.message}")
    } catch (e:Exception){
            println("Please input a valid integer value.")
    } finally {
        println("Thank you for using this simple program.")
    }
}