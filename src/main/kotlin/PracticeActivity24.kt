fun main(){
    var number:Int = 0
    var square:Int = 0
    var cube:Int = 0
    var totalSquare:Int = 0
    var totalCube:Int = 0

    var ctr:Int = 0
    println("\nNumber\t\tSquare\t\tCube")
    for (counter in 1..5){
        number = counter * 2
        square = number * number
        cube = number * number * number
        println("${number}\t\t\t${square}\t\t\t${cube}")

        totalSquare+=square
        totalCube+=cube
        ctr++
    }
    println("Total\t\t$totalSquare\t\t\t$totalCube")
}