fun main(){
    //initialize variable
    var length:Double = 0.0
    var width:Double = 0.0
    var perimeterOfRectangle:Double = 0.0
    var areaOfRectangle:Double = 0.0

    //Input values
    print("\nEnter the value of length: ")
    length = readln().toDouble()
    print("Enter the value of width: ")
    width = readln().toDouble()

    //process the value
    perimeterOfRectangle = (length + width) * 2
    areaOfRectangle = length * width

    //output value
    println("\nThe perimeter of rectangle ((length + width) x 2) is %.2f ".format(perimeterOfRectangle))
    println("The perimeter of rectangle ((length + width) x 2) is %.2f ".format(perimeterOfRectangle))
    println("The area of rectangle (length x width) is  %.2f".format(areaOfRectangle))
    //https://www.tutorialspoint.com/kotlin-program-to-round-a-number-to-n-decimal-places
}