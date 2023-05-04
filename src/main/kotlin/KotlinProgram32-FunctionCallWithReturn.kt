fun main(){
    var number = returnDigit()
    println(number)
    var name = returnName()
    println(name)
}

fun returnDigit():Int{
    println("Hello this is returnDigitFunction")
    return 29
}

fun returnName():String {
    return "John"
}