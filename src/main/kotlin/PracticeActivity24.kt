fun main(){
    var number = arrayOf<Int>(2,4,6,8,10)
    var square = arrayOf<Int>(4,16,36,64,100,220)
    var cube = arrayOf<Int>(8,64,216,512,1000)
    var totalSquare:Int = 0
    var totalCube:Int = 0

    var ctr:Int = 0
    println("\nNumber\t\tSquare\t\tCube")
    while(ctr < number.size){
        println("${number[ctr]}\t\t\t${square[ctr]}\t\t\t${cube[ctr]}")

        totalSquare+=square[ctr]
        totalCube+=cube[ctr]
        ctr++
    }
    println("Total\t\t$totalSquare\t\t\t$totalCube")
}