package practiceactivities

fun main(){//Activity 51
    print("\nEnter a positive integer: ")
    var number = readln().toInt()

    val factorial = {num:Int -> findFactors(num) }
    println("Factorial: ${factorial(number)}")
}
fun findFactors(num:Int):Int{
    var factorial:Int = 1
    for(ctr in 1 .. num){
        factorial *= ctr
    }

    return factorial
}