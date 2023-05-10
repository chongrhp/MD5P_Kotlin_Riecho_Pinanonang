package kotlinactivity

fun main(){
    var amounts = 0.00

    try {
        for (i in 1..5) {
            print("Enter amount number $i: ")
            amounts += readln().toDouble()
        }

        var dividedBy:Int = 0
        while (true) {

            print("Divide the value by how many? ")
            dividedBy = readln().toInt()

            if(dividedBy == 0){
                println("Integer value must be greater than zero (0).")
                println()
            } else {
                break
            }
        }

        println("Total average is: ${amounts/dividedBy}")

    } catch(e:NumberFormatException) {
        println("Error message: Please check the input value for divisor")
    } catch(e:Exception){
        println("Error Message: ${e.message}")
    } finally {
        println("Thank you for using this simple application.")
    }
}