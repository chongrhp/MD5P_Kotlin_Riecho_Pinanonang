import kotlin.math.max

fun main(){
    //Declare variables
    var number = ArrayList<Int>()
    var ctr:Int = 0
    var maxNumber:Int = 0
    var minNumber:Int = 0

    //loop
    while(ctr < 5){

        //Input value
        print("Enter number ${ctr+1}: ")
        number.add(readln().toInt())

        //Process and get maximum number
        if (number[ctr] > maxNumber) {
            maxNumber = number[ctr]
        }

        //get minimum number
        if (number[ctr] < minNumber && minNumber != 0) {
            minNumber = number[ctr]
        } else if(minNumber == 0) {
            minNumber = number[ctr]
        }

        ctr++
    }

    //Display the maximum and minimum number
    if(maxNumber > minNumber) {
        println("Max value is : $maxNumber")
        println("Min value is : $minNumber")
    } else {
        println("No maximum and minimum numbers found on the list.")
    }
}