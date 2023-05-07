package practiceactivities

fun main(){
    myHigherOrderFunctions(lambdalist)
}

var numbers = mutableListOf<Int>(9,2,3,4,5)
var lambdalist = { print(showList(numbers)) }

fun myHigherOrderFunctions(myFunction:() -> Unit){
    myFunction()
}

fun showList(list:MutableList<Int>):MutableList<String>{
    var cons = mutableListOf<String>()
    for (n in list) cons.add("Number: $n")
    return cons
}