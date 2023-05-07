package kotlinprogram

fun main(){
    print("Enter number: ")
    var input = readln().toInt()
    var num = cube(input)
    println("The cube of $input is $num")
}

fun cube(digit:Int):Int{ //parameters - arguments within a function
     var result:Int = digit * digit * digit
    return result
}