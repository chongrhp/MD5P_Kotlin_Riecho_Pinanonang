package Exercise.StudentEnrollmentSystem

class Student(var name:String, var studentId: Int) {
    private val courses = mutableListOf<Course>()

    fun enroll(course:Course){
        if(course.isFull()){
            println("${course.name} is already full. Enrollment is closed.")
        } else if(course.isStudentEnrolled(this)){
            println("$name is already enrolled in ${course.name}.")
        } else {
            course.addStudent(this)
            courses.add(course)
            println("$name enrolled in ${course.name} successfully.")
        }
    }

    fun drop(course: Course){
        if(course.isStudentEnrolled(this)){
            course.removeStudent(this)
            courses.remove(course)
            println("$name dropped ${course.name} successfully.")
        } else {
            println("$name is not enrolled in ${course.name}")
        }
    }

    fun listCourses(){
        if(courses.isEmpty()){
            println("$name is not enrolled in any courses.")
        } else {
            println("$name is enrolled in the following courses: ")
            for(course in courses){
                println("- ${course.name}")
            }
        }
    }
}