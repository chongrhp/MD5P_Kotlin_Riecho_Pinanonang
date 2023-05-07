package practiceactivities

fun main(){ //Activity 50
    //Input variables
    print("\nEnter your weight(in Kg): ")
    var inWeight = readln().toDouble()
    print("Enter your height(in meters): ")
    var inHeight = readln().toDouble()

    val yourBMI = {weight:Double, height:Double -> (weight /(height * height))}
    println("BMI: ${String.format("%.2f",yourBMI(inWeight,inHeight))}")
}
