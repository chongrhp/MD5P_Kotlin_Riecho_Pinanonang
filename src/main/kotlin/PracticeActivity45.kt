fun main(){
    print("\nEnter a positive integer: ")
    var number = readln().toInt()
    var factorial = findFactorial(number)

    println("Factorial: $factorial")
}

fun findFactorial(num:Int):Int{
    var factorial:Int = 1
    for(ctr in 1 .. num){
        factorial *= ctr
    }

    return factorial
}