
fun main() {
    val matrix = mutableListOf(
        mutableListOf<Int>()
    )

    var number = 1
    val squareSize = 3


    for (rows in 0..squareSize-1) {
        for (cols in 0..squareSize-1) {
            print("Enter Number ${number}: ")
            matrix[rows].add(readln().toInt())
            number++
        }

        if (matrix.size < squareSize) matrix.add(mutableListOf<Int>())
    }

    //initialize variable of summation of slant and reverse slant
    var leftTorightLower = 0
    var leftTorightUpper = 0

    for (rows in 0..(matrix.size-1)) {
        for (cols in 0..(matrix[rows].size -1)) {
            print("${matrix[rows][cols]}\t")
        }
        leftTorightLower += matrix[rows][rows]
        leftTorightUpper += matrix[(matrix.size-1)-rows][rows]
        println()
    }

    var squareIsMagic:Boolean = true
    if(leftTorightLower == leftTorightUpper){
        for(rows in 0 ..(matrix.size-1)){
            if(leftTorightLower == matrix[rows].sum()){

                //initialize variable for summation of columns
                var columns = 0
                for(cols in 0.. (matrix[rows].size-1)){
                    columns += matrix[cols][rows]
                }

                //compare column's
                if(leftTorightLower != columns){
                    squareIsMagic = false
                    break //stop and exit current loop
                }

            } else {
                squareIsMagic = false
                break //top and exit current loop
            }
        }
    } else {
        squareIsMagic = false
    }

    if(squareIsMagic){
        println("Your square is Square Magic")
    } else {println("Your square is not a Square Magic")}

}
