package practiceactivities

fun main(){
    var number:Double = 0.0
    while(true) {
        try{
            print("Enter a decimal number: ")
            number = readln().toDouble()

            println("Converted to integer: ${number.toInt()}")
        } catch(e:Exception){
            println("Error message: ${e.message}")
            break
        }
    }
}