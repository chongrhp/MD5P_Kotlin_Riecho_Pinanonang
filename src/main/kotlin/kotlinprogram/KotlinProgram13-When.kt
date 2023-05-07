package kotlinprogram

fun main(){
    //when statement -> java, c, c$ c++ -> switch statement

    //digits to words
    var num:Int = 0

    println("Enter a number")
    num = readln().toInt()

    //when statement does not use conditional operators
    when(num){
        1 -> { println("One")}
        2 -> { println("Two")}
        3 -> { println("Three")}
        4 -> { println("Four")}
        else -> { println("Invalid number")}
    }
}