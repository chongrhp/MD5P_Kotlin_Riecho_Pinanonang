package practiceactivities

fun main(){
    //initialize variable
    var examScore:Int = 0

    //Input variable
    print("\nEnter your exam score (out of 100): ")
    examScore = readln().toInt()

    if(examScore >= 90) {
        println("Your grade is A")
    } else if (examScore >= 80) {
        println("Your grade is B")
    } else if (examScore >= 70) {
        println("Your grade is C")
    } else if (examScore >= 60) {
        println("Your grade is D")
    } else  {
        println("Your grade is F")
    }
}