
fun main(){
    var number:Int = 25
    var columns:Int = 0
    var rowsAndColumns:Int = 5


    for(rowCounter in 1..rowsAndColumns){
        columns = number
        for(columnCount in 1..rowsAndColumns){
            print("${columns}\t")
            columns -=rowsAndColumns
        }
        println()
        number--
    }
}