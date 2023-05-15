package Exercise.StudentEnrollmentSystem

import ooppracticeactivities.ooppracticeactivity13university.University

fun main(){
    var students = ArrayList<Student>()
    var courses = ArrayList<Course>()

    var option = 'i'
    do {
        menuOption()
        option = readln().first()
        when(option){
            'a' -> newStudents(students)
            'b' -> newCourses(courses)
            'c' -> listOfStudents(students)
            'd' -> listOfCourses(courses)
            'e' -> enrollStudent(students,courses)
            'f' -> withdrawStudentFromCourse(students,courses)
            'g' -> findStudent(findId("student"),students)
            'h' -> findCourse(findId("course"),courses)
        }
    } while (option != 'x')
}

fun findId(msg:String):String{
    print("Enter $msg ID: ")
    var id = readln()
    return id
}

fun menuOption(){
    println()
    println("======= Enrollment System ========")
    println("[a] New Student")
    println("[b] New Courses")
    println("[c] List of Students")
    println("[d] List of Courses")
    println("[e] Enroll student in a course")
    println("[f] Withdraw a student in a course")
    println("[g] List of Courses student enrolled")
    println("[h] List of Students under courses")
    println("[x] Exit Menu")
    print("Please enter you option: ")
}

fun withdrawStudentFromCourse(
    list:ArrayList<Student>,
    courseList: ArrayList<Course>){

    println()
    print("Enter student ID: ")
    var studID = readln().toInt()
    print("Enter Course ID: ")
    var courseID = readln()

    for(student in list){
        if(student.studentId == studID){
            for(course in courseList){
                if(course.courseID == courseID){
                    student.drop(course)
                    println("${student.name} was drop to ${course.name} course.")
                }
                break
            }
            break
        }
    }
}

fun enrollStudent(
    studList:ArrayList<Student>,
    courseList:ArrayList<Course>){

    println()
    println("Enroll student in a course")
    print("Enter student ID:")
    val studId = readln().toInt()
    for (stud in studList){
        if (stud.studentId == studId){
            print("Enter Course ID: ")
            val courseID = readln()
            for (course in courseList){
                if(course.courseID == courseID){
                    stud.enroll(course)
                    break
                }

            }
            break
        }
    }
}

fun findStudent(search:String, list:ArrayList<Student>){
    for(student in list){
        if(student.studentId == search.toInt()){
            student.getListCourses()
            break
        }
    }
}

fun findCourse(search:String, list:ArrayList<Course>){
    for(course in list){
        if(course.courseID == search){
            course.getListOfStudents()
            break
        }
    }
}

fun listOfStudents(list:ArrayList<Student>){
    println()
    println("**** List of students ****")
    for(student in list){
        println("Name: ${student.name},\t"+
        "Age: ${student.Age}, Gender: ${student.Age},\t"+
        "Contacts: ${student.contacts}")
    }
}

fun listOfCourses(list:ArrayList<Course>){
    println("**** List of Courses ****")
    for(course in list){
        println("Course ID: ${course.courseID},\t"+
                "Course ${course.name},\t"+
        "Instructor:${course.instructor},\t"+
        "max students: ${course.maxStudents}"+
        "enrolled: ${course.studentsEnrolled()}")
    }
}

fun newStudents(list:ArrayList<Student>){
    println()
    var studID:Int = 0
    var name:String = ""
    var age:Int = 0
    var gender:String = ""
    var contact:String = ""
    while(true) {
        try {
            print("Enter student ID: ")
            studID = readln().toInt()
            print("Name: ")
            name = readln()
            print("Age: ")
            age = readln().toInt()
            print("Gender: ")
            gender = readln()
            print("Contacts: ")
            contact = readln()

            var newStudent = Student(studID,name,age,gender,contact)
            list.add(newStudent)
            break
        } catch (e: Exception) {
            println("Error data entry: ${e.message}")
            print("Re entry all data [y/n]?")
            var i = readln().first()
            if (i=='n') break
        }
    }
}

fun newCourses(list:ArrayList<Course>){
    var courseID:String = ""
    var name:String = ""
    var instructor:String = ""
    var maxStud:Int = 0
    println()

    while(true) {
        try {
            print("Course ID: ")
            courseID = readln()
            print("Name: ")
            name = readln()
            print("Max students: ")
            maxStud = readln().toInt()
            print("Instructor: ")
            instructor = readln()

            val newCourse = Course(courseID, name, instructor, maxStud)
            list.add(newCourse)
            break
        } catch(e:Exception){
            println("Error data entry: ${e.message}")
            print("Re-entry data [y/n]")
            var i = readln().first()
            if(i == 'n') break
        }
    }
}