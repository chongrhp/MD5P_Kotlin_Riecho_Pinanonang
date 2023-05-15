package Exercise.StudentEnrollmentSystem

class Course(
    var courseID:String,
    var name:String,
    var instructor:String,
    var maxStudents: Int) {
    private val students = mutableListOf<Student>()

    fun addStudent(student: Student){
        students.add(student)
    }

    fun removeStudent(student: Student){
        students.remove(student)
        println("Student: ${student.name} was remove on this course ${this.name}")
    }

    fun isStudentEnrolled(student:Student):Boolean {
        return student in students
    }

    fun isFull():Boolean{
        return students.size == maxStudents
    }

    fun studentsEnrolled():Int{
        return this.students.size
    }
    fun getListOfStudents(){
        println()
        println("****************************************\n"+
                "Course ID: ${this.courseID},\t"+
                "${this.name},\tInstructor: ${this.instructor}")
        println("***************************************")
        println("       LIST OF STUDENTS        ")
        println("---------------------------------------")
        for(student in this.students){
            println("ID: ${student.studentId},\t"+
            "Name: ${student.name},\t"+
            "Age: ${student.Age},\t"+
            "Gender: ${student.gender},\t"+
            "Contacts: ${student.contacts}")
        }
        println("---------------------------------------")
    }
}