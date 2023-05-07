package kotlinprogram

fun main(){
    //lamda
    val displayName = { println("Peter") }
    val addNumbers = {num1:Int, num2:Int -> num1 + num2}

    displayName()
    println(addNumbers(5,1))
}

//fun addNumbers(num1:Int, num2:Int):Int{
//    return num1+num2
//}

//fun displayName(){
//    println("Peter")
//}