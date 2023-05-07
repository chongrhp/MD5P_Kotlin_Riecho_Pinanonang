package kotlinprogram

fun main(){
    //myHigherOrderFunction2(lambdaMinus)
}

var lambdaAdd = {num1:Int, num2:Int -> num1 + num2}
var lambdaMinus = {num1:Int, num2:Int -> num1 - num2}

fun myHigherOrderFunction2(myFunction: (Int, Int) -> Int){
    println(myFunction(2,5))
}