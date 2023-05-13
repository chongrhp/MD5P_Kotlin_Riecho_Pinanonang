package Exercise.StudentEnrollmentSystem

class Course(var name:String, val maxStudents: Int) {
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
}