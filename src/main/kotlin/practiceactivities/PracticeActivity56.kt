package practiceactivities

fun main(){

    try {
        print("\nEnter a positive integer: ")
        var number = readln().toInt()

        //if input number is negative (-) number then throw exception
        if(number < 0) throw Exception()

        //i'm using function fun findFactors from activity 51
        val factorial = {num:Int -> findFactors(num) }
        println("Factorial: ${factorial(number)}")

    } catch (e: Exception){
        println("Error: Invalid input. Please enter a positive integer.")
    } finally {
        println("Thank you for using this simple program!")
    }
}
