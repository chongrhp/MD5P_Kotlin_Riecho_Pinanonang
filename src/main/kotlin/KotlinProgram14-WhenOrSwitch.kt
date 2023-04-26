fun main() {
    //
    var selection: Int = 0
    println("Please enter Selection")
    println("[1] Register Student")
    println("[2] Compute Grades")
    selection = readln().toInt()

    when(selection){
        1-> {
            println("Student Registration!")
            println("Enter Name:")
            var name : String = readln()
            println("Enter course: ")
            var course : String = readln()

            println("Do you want to register $name with course $course?")
            var response: String = readln()

            if(response == "yes" || response == "Yes"){
                println("Registered successfully!")
            } else {
                println("Registration Failed!")
            }
        }
        2-> {
            println("Student Grade computation!")
            println("Enter grade 1: ")
            var grade1 : Int = readln().toInt()
            println("Enter grade 2: ")
            var grade2 : Int = readln().toInt()
            println("Enter grade 3: ")
            var grade3 : Int = readln().toInt()

            var gradeAverage = (grade1 + grade2 + grade3)/3

            println("Average is $gradeAverage")
            if (gradeAverage > 74){
                println("Passed!")
            } else {
                println("Failed!")
            }
        }
    }
}