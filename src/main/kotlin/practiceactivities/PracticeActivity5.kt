package practiceactivities

fun main(){
    //Initialize variable
    var nameOfStudent:String = ""
    var unitsEnrolled:Int = 0
    var pricePerUnit:Double = 0.0
    var computedTuitionFee:Double = 0.0
    var cashPayment:Double = 0.0
    var installment2:Double = 0.0
    var installment3:Double = 0.0

    //Input variables
    print("\nEnter name of student: ")
    nameOfStudent = readln()
    print("Enter number of units enrolled: ")
    unitsEnrolled = readln().toInt()
    print("Enter price per unit: ")
    pricePerUnit = readln().toDouble()

    //Process values
    computedTuitionFee = unitsEnrolled * pricePerUnit
    cashPayment = computedTuitionFee - (computedTuitionFee * 0.1)
    installment2 = computedTuitionFee + (computedTuitionFee * 0.05)
    installment3 = computedTuitionFee + (computedTuitionFee * 0.1)

    //Display output value
    println("\n$nameOfStudent, you could avail the following payment mode:")
    println("Computed tuition fee: $${String.format("%,.2f",computedTuitionFee)}")
    println("Payment mode: $${String.format("%,.2f",cashPayment)}")
    println("Cash Payment: $${String.format("%,.2f",installment2)}")
    println("2-installment: $${String.format("%,.2f",installment3)}")
}