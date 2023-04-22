package practiceactivities

fun main(){
    //Initialize variables
    var number:Int = 1
    var factorial:Int = 1
    var loopNumber :Int = 1

    print("\nEnter a positive integer: ")
    number = readln().toInt()
    loopNumber = number

    do{
        //process factorial value
        //factorial = factorial * loopNumber
        println("factorial number of $number by step of $loopNumber * $factorial = ${factorial * loopNumber}")
        factorial *= loopNumber

        //update loop
        loopNumber--
    } while(loopNumber > 0) //condition

    //display output
    println("\nThe factorial number of $number is $factorial")
}