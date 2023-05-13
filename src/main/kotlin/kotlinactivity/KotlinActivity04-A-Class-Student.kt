package kotlinactivity
class Student(
    var firstName: String,
    var middleName: String,
    var lastName: String,
    var studID: String,
    var yearEnrolled: Int)
fun main(){
    var students =ArrayList<Student>()
    var newStudent = Student(
        "Riecho",
        "Hernandez",
        "Pinanonang",
        "1001",
        2023)
    students.add(newStudent)

    newStudent = Student(
        "Airen",
        "Erojo",
        "Pinanonang",
        "1002",
        2023)
    students.add(newStudent)

    newStudent = Student(
        "Dynmark",
        "Pinanonang",
        "Encabo",
        "1003",
        2023)

    students.add(newStudent)
    listAllStudents(students)
    updateStudentWildSearch(students)
    listAllStudents(students)
    searchStudentWildSearch(students)
}


fun updateStudentWildSearch(students:ArrayList<Student>){
    println()
    print("Enter wild string to search and update: ")
    val search = readln()
    var isFound = false
    for(student in students){
        if(student.firstName.uppercase().contains(search.uppercase()) ||
            student.middleName.uppercase().contains(search.uppercase()) ||
            student.lastName.uppercase().contains(search.uppercase()))
        {
            print("Student Name: ${student.firstName} " +
                    "${student.middleName.first()}. " +
                    "${student.lastName} \t")
            print("ID: ${student.studID},\t")
            println("Year enrolled: ${student.yearEnrolled}")

            print("Update First Name:")
            var newFirstName = readln()
            if(newFirstName != "") student.firstName = newFirstName

            print("Update Middle Name:")
            var newMiddleName = readln()
            if(newMiddleName != "") student.middleName  = newMiddleName

            print("Update Last Name:")
            var newLastName = readln()
            if(newLastName != "") student.lastName = newLastName

            print("Update student ID:")
            var newStudId = readln()
            if(newStudId != "") student.studID = newStudId

            print("Update year Enrolled:")
            var newYearEnrolled = readln().toInt()
            if(newYearEnrolled > 0) student.yearEnrolled = newYearEnrolled

            isFound = true
        }
    }
    if(!isFound)println("No record found on the list.")

}
fun searchStudentWildSearch(students:ArrayList<Student>){
    println()
    print("Enter wild string to search: ")
    val search = readln()
    var isFound = false
    for(student in students){
        if(student.firstName.uppercase().contains(search.uppercase()) ||
            student.middleName.uppercase().contains(search.uppercase()) ||
            student.lastName.uppercase().contains(search.uppercase()))
            {
                print("Student Name: ${student.firstName} " +
                        "${student.middleName.first()}. " +
                        "${student.lastName} \t")
                print("ID: ${student.studID},\t")
                println("Year enrolled: ${student.yearEnrolled}")
                isFound = true
        }
    }
    if(!isFound)println("No record found on the list.")
}

fun listAllStudents(students:ArrayList<Student>){
    println("***** List of Students ***** ")
    for(student in students){
        print("Student Name: ${student.firstName} " +
                "${student.middleName.first()}. " +
                "${student.lastName} \t")
        print("ID: ${student.studID},\t")
        println("Year enrolled: ${student.yearEnrolled}")
    }
}

