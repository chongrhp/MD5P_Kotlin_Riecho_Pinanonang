fun main(){ //Activity 49
    var lenth:Double = 0.0
    var width:Double = 0.0

    print("Enter lenght: ")
    lenth = readln().toDouble()
    print("Enter width: ")
    width = readln().toDouble()

    val perimeter = lenth.toPerimeter(width)
    val area = lenth.toArea(width)

    println("Perimeter is ${String.format("%.2f",perimeter)} meters")
    println("Area is ${String.format("%.2f",area)}")
}

infix fun Double.toPerimeter(width:Double):Double{
    return (this + width) * 2
}

infix fun Double.toArea(width: Double):Double{
    return this * width
}