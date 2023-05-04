import kotlin.math.max
fun main(){
    //Declare variables
    var number = ArrayList<Int>()

    //loop
    for (ctr in 1 .. 5){
        print("Enter number ${ctr}: ")
        number.add(readln().toInt())
    }
/*
    val maxNumber = number.max()
    val minNumber = number.min()
    //Display the maximum and minimum number
    println("Max value is : $maxNumber")
    println("Min value is : $minNumber")
*/
}