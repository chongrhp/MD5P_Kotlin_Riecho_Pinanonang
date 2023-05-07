package practiceactivities

fun main(){//Activity 52
    var numbers = mutableListOf<Double>()
    for(ctr in 1 .. 5) {
        print("Enter Number $ctr: ")
        numbers.add(readln().toDouble())
    }

    val average = {numb:MutableList<Double> -> numb.sum()/numb.size}
    println("Average: ${average(numbers)}")
}