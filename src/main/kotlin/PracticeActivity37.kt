fun main(){
    var lenth:Double = 0.0
    var width:Double = 0.0

    print("Enter lenght: ")
    lenth = readln().toDouble()
    print("Enter width: ")
    width = readln().toDouble()

    var perimeter = rectPerimeter(lenth, width)
    var area = rectArea(lenth, width)

    println("Perimeter is $perimeter meters")
    println("Area is $area")
}

fun rectArea(length:Double, width:Double):Double{
    var area = length * width
    return area;
}

fun rectPerimeter(length: Double, width: Double):Double{
    var perimeter = (length + width) * 2
    return perimeter
}