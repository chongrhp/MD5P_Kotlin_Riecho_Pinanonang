package ooppracticeactivities.ooppracticeactivity6shape

fun main(){
    val rectangle1 = Shape()
    println("**** Shape 1 *****")
    print("Length: ${rectangle1.length} \t")
    println("Width: ${rectangle1.width}")
    println()

    val rectangle2 = Shape(3,4)
    println("**** Shape 2 *****")
    print("Length: ${rectangle2.length} \t")
    println("Width: ${rectangle2.width}")
}