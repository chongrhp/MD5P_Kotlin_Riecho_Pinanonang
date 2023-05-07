package practiceactivities

fun main(){
    //Initialize variables
    //var bmiStatus:String = ""

    //Input variables
    print("\nEnter your weight(in Kg): ")
    var inWeight = readln().toDouble()
    print("Enter your height(in meters): ")
    var inHeight = readln().toDouble()

    val yourBMI = calculateBMI(inWeight, inHeight)
    println("BMI: ${String.format("%.2f",yourBMI)}")
}

fun calculateBMI(weight:Double, height:Double):Double{
    var bmi = weight /(height * height)
    return bmi
}