package practiceactivities

fun main(){
    //Initialize variables
    var inWeight:Double = 0.0
    var inHeight:Double = 0.0
    var yourBMI:Double = 0.0
    var bmiStatus:String = ""

    //Input variables
    print("\nEnter your weight(in Kg): ")
    inWeight = readln().toDouble()
    print("Enter your height(in meters): ")
    inHeight = readln().toDouble()

    //Process formula
    yourBMI = inWeight /(inHeight * inHeight)

    //Get the status of BMI value
    if (yourBMI >= 30){
        bmiStatus = "obese"
    } else if(yourBMI >= 25 && yourBMI <= 29.9) {
        bmiStatus = "over"
    } else if(yourBMI >= 18.5 && yourBMI <= 24.9) {
        bmiStatus = "normal"
    } else {
        bmiStatus = "under"
    }

    //Display output
    println("Your BMI is ${String.format("%.2f",yourBMI)} which is in the $bmiStatus weight range")
}
