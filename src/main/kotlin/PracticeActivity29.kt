import kotlin.math.max

fun main(){
    var number = ArrayList<Int>()
    var ctr:Int = 0
    var maxNumber:Int = 0
    var minNumber:Int = 0

    while(ctr < 5){
        print("Enter number ${ctr+1}: ")
        number.add(readln().toInt())
        if (number[ctr] > maxNumber) {
            maxNumber = number[ctr]
        }

        if (number[ctr] < minNumber && minNumber != 0) {
            minNumber = number[ctr]
        } else if(minNumber == 0) {
            minNumber = number[ctr]
        }

        ctr++
    }

    if(maxNumber > minNumber) {
        println("Max value is : $maxNumber")
        println("Min value is : $minNumber")
    } else { println("No maximum and minimum numbers found on the array.")}
}