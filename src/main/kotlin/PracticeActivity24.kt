fun main(){

    //Declare variables
    var number:Int = 0
    var square:Int = 0
    var cube:Int = 0
    var totalSquare:Int = 0
    var totalCube:Int = 0
    var ctr:Int = 0

    //Display header
    println("\nNumber\t\tSquare\t\tCube")

    //process and display series number
    for (counter in 1..5){
        number = counter * 2
        square = number * number
        cube = number * number * number
        println("${number}\t\t\t${square}\t\t\t${cube}")

        totalSquare+=square
        totalCube+=cube
        ctr++
    }

    //Display output total values
    println("Total\t\t$totalSquare\t\t\t$totalCube")
}