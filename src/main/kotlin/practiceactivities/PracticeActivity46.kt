package practiceactivities

fun main(){
   var numbers = mutableListOf<Double>()
    for(ctr in 1 .. 5) {
        print("Enter Number $ctr: ")
        numbers.add(readln().toDouble())
    }

    val average = computeAverage(numbers)
    println("Average: $average")
}

fun computeAverage(number:MutableList<Double>):Double{
    val average = number.sum()/number.size
    return average
}