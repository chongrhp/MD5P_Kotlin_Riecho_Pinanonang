fun main(){
    val matrix =  mutableListOf(
        mutableListOf<Int>()
        )

    var row = 0
    var column = 0
    var number = 0
    var matrixRowsColumns = 3

    //Input matrix and values
    while(row < matrixRowsColumns){
        while(column < matrixRowsColumns) {
            print("Enter Number ${number + 1}: ")
            matrix[row].add(readln().toInt())
            column++
            number++
        }

        //Update controls and add new row of list
        column = 0
        row++
        matrix.add(mutableListOf<Int>())
    }

    //Display output
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