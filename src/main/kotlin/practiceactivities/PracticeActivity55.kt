package practiceactivities

fun main() {

    try {
        print("Enter the first number: ")
        var num1 = readln().toInt()
        print("Enter the second number: ")
        var num2 = readln().toInt()

        println("The quotient is ${num1/num2}")
    } catch(e:Exception){
       println("Error division by 0")
    } finally {
        println("Thank you for using this simple program!")
    }
}