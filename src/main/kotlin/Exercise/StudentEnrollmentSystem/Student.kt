package Exercise.StudentEnrollmentSystem

class Student(var studentId: Int,
    var name: String,
    var Age: Int,
    var gender:String,
    var contacts:String
    ) {
    private val courses = mutableListOf<Course>()

    fun enroll(course:Course){
        if(course.isFull()){
            println("${course.name} is already full. Enrollment of this is closed.")
        } else if(course.isStudentEnrolled(this)){
            println("$name is already enrolled in this ${course.name} course.")
        } else {
            course.addStudent(this)
            courses.add(course)
            println("$name enrolled in ${course.name} course successfully.")
        }
    }

    fun drop(course: Course){
        if(course.isStudentEnrolled(this)){
            course.removeStudent(this)
            courses.remove(course)
            println("$name dropped from ${course.name} course successfully.")
        } else {
            println("$name is not enrolled in '${course.name.uppercase()}' course")
        }
    }

    fun getListCourses(){
        if(courses.isEmpty()){
            println("$name is not enrolled in any courses.")
        } else {
            println()
            println("********************************************")
            println("Student ID: ${this.studentId},\t"+
            "Name: ${this.name},\t"+
            "Gender: ${this.gender}")
            println("********************************************")
            println("       LIST OF ENROLLED COURSES         ")
            println("--------------------------------------------")
            for(course in courses){
                println("- ${course.name}")
            }
            println("--------------------------------------------")
        }
    }
}