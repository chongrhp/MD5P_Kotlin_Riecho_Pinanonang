package practiceactivities

fun main(){
    try {
        var numList = arrayOf<Int>(5,2,6,1,8)
        print("Enter an index: ")
        var index = readln().toInt()

        println("The value of index $index is ${numList[index]}")

    } catch(e:ArrayIndexOutOfBoundsException){
        println("Error: Index out of bounds. Please enter an index between 0 and 4")
    } catch(e:NumberFormatException){
        println("Error: Enter positive integer value.")
    } finally {
        println("Thank you for using this simple program")
    }

}

//NumberFormatException
//ArrayIndexOutOfBoundsException