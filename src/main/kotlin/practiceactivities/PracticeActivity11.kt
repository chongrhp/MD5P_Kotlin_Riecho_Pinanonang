package practiceactivities

fun main(){
    //initialize variables
    var studentName:String = ""
    var gradeInPhysics:Int = 0
    var gradeInAlgebra:Int = 0
    var gradeInProgramming:Int = 0
    var averageGrade:Double = 0.0
    var gradeStatus:String = ""

    //Input variables
    print("\nEnter name: ")
    studentName = readln()
    print("Enter grade in Physics: ")
    gradeInPhysics = readln().toInt()
    print("Enter grade in Algebra: ")
    gradeInAlgebra = readln().toInt()
    print("Enter grade in Programming: ")
    gradeInProgramming = readln().toInt()

    //process and check argument for student awardees
    averageGrade = (gradeInPhysics.toDouble() + gradeInAlgebra.toDouble() + gradeInProgramming.toDouble())/3

    if (averageGrade > 100){
        gradeStatus = "Invalid grade"
    }
    else if (averageGrade >= 95) {
        gradeStatus = "President lister"
    }
    else if (averageGrade >= 89){
        gradeStatus = "Dean lister"
    }
    else if (averageGrade >= 83){
        gradeStatus = "Average Student"
    }
    else if (averageGrade >= 78){
        gradeStatus = "Fair"
    }
    else {
        gradeStatus = "Failure"
    }

    //Display output
    println("\n$studentName, average grade is ${String.format("%,.2f",averageGrade)} \n$gradeStatus")

}
