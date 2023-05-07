package practiceactivities

fun main() { //Activity 53
    var lenth: Double = 0.0
    var width: Double = 0.0

    print("Enter lenght: ")
    lenth = readln().toDouble()
    print("Enter width: ")
    width = readln().toDouble()

    val perimeter = { len: Double, wid: Double -> (len + wid) * 2 }
    val area = { len: Double, wid: Double -> len * wid }

    println("Perimeter is ${perimeter(lenth, width)} meters")
    println("Area is ${area(lenth, width)}")
}