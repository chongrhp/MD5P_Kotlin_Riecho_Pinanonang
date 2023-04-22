package practiceactivities

fun main(){
    var number:Int = 0

    print("Enter a positive number: ")
    number = readln().toInt()

    repeat(10){
        println("$number * ${it + 1} = ${number * (it+1)}")
    }
}