fun main(){
    val matrix = listOf(
        listOf('a','b','c'),
        listOf('e','f','g'),
        listOf('h','i','j'),

    )
    //println(matrix.size) //get the number of rows
    var row = 0
    //0 -3
    while(row < matrix.size){
        var column = 0
         while(column < matrix[row].size){
            print("${matrix[row][column]} \t")
            column++
        }

        println()
        row++
    }

}