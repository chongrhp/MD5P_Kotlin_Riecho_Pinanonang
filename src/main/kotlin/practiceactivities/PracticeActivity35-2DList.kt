package practiceactivities

fun main(){
    val matrix =  mutableListOf(
        mutableListOf<Int>()
    )

    var number = 1
    var squareSize = 3

    //display perfect square
    for (rows in 0 ..(squareSize-1)){
        for (cols in 0 .. (squareSize-1)){

            print("Enter Number ${number}: ")
            matrix[rows].add(readln().toInt())
            number++
        }

        //add mutable list of matrix if size is less than squaresize
        if(matrix.size < squareSize) {
            matrix.add(mutableListOf<Int>())
        }
    }

    for (rows in 0..(matrix.size-1)){
        for (cols in 0.. (matrix[rows].size-1)){
            print("${matrix[rows][cols]}\t")
        }
        println()
    }

}
