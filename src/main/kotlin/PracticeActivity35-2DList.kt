fun main(){
    val matrix =  mutableListOf(
        mutableListOf<Int>(1,1,1),
        mutableListOf<Int>(1,1,1),
        mutableListOf<Int>(1,1,1),
        )
    //println(matrix.size) //get the number of rows
    var row = 0
    var column = 0
    var number = 0

    while(row < matrix.size){
        column = 0
        while(column < matrix[row].size) {
            print("Enter Number ${number + 1}: ")
            matrix[row][column] = readln().toInt()
            column++
            number++
        }
        row++
    }

    //matrix.add(mutableListOf(0,0,0))

    row = 0
    while(row < matrix.size){
        column = 0
        while(column < matrix[row].size){
            print("${matrix[row][column]} \t")
            column++
        }
        println()
        row++
    }

}