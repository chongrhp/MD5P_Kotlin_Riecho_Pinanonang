fun main() {
    //higher order function
    //functions that can accept another function
    //as its parameter
    //sayHello()
    myHigherOrderFunction(sayHello2)
}

fun myHigherOrderFunction(myFunction:() -> Unit){
    myFunction()
}

fun total(number1: Int, number2:Int):Int{
    return number1+number2
}

var sayHello2 = {println("Hello World")}