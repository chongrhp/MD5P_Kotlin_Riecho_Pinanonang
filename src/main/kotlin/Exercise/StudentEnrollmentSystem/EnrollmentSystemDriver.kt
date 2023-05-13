package Exercise.StudentEnrollmentSystem

fun main(){
    val riecho = Student("Riecho",1)
    val airen = Student("Airen",2)
    val dynmark = Student("Dynmark",3)
    val lynlyn = Student("Lyn Lyn Toroy",4)
    val math = Course("Calculus I",2)
    val science = Course("Scients III",3)

    riecho.enroll(math)
    airen.enroll(math)
    dynmark.enroll(math) //course is full
    lynlyn.enroll(math) //course is full
    dynmark.enroll(science)
    airen.enroll(science)
    riecho.enroll(science)
    math.removeStudent(airen)
    dynmark.enroll(math)
}