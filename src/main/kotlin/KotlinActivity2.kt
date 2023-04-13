fun main(){
    //initialize variable
    var length:Double = 0.0
    var width:Double = 0.0
    var perimeterOfRectable:Double = 0.0
    var areaOfRectangle:Double = 0.0

    //Input values
    println("Enter the value of length: ")
    length = readln().toDouble()
    println("Enter the value of width: ")
    width = readln().toDouble()

    //process the value
    perimeterOfRectable = (length + width) * 2
    areaOfRectangle = length * width
    //output value


    println("The perimeter rectangle is %.1f $perimeterOfRectable")
    println("The area of rectable is  %.2f".format(areaOfRectangle))

}