fun main(){
    //set -immutable
    var numbers = setOf<Int>(1,3,5,7,9,9,1)
    //println(numbers.elementAt(0))

    var ctr:Int = 0
    while(ctr < numbers.size){
        println(numbers.elementAt(ctr))
        ctr++
    }
    println("*********\n")

    //mutable set
    var number2 = mutableSetOf<Int>(1,3,5,7,9)
    number2.add(6)
    number2.remove(3)

    var ctr2:Int = 0
    while(ctr2 < number2.size){
        println(number2.elementAt(ctr2))
        ctr2++
    }
}