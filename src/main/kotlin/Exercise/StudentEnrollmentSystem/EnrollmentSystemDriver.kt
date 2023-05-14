package Exercise.StudentEnrollmentSystem

fun main(){
    val riecho = Student(
        1,
        "Riecho Pinanonang",
        23,
        "Male",
        "chong2hp@gmail.com")

    val airen = Student(2,
        "Airen Pinanonang",
        20,
        "Female",
        "airen@yahoo.com")

    val dynmark = Student(3,
        "Dynmark Encobo",
        32,
        "Male",
        "Dynz@gmail.com")

    val lynlyn = Student(
        4,
        "Lyn Lyn Toroy",
        32,
        "Female",
        "lyn@yahoo.com" )

    val math = Course(
        "1001",
        "Calculus I",
        "Mr Math",
        2)

    val science = Course(
        "1002",
        "Scients III",
        "Mr Science",
        3)

    riecho.enroll(math)
    airen.enroll(math)
    dynmark.enroll(math) //course is full
    lynlyn.enroll(math) //course is full
    dynmark.enroll(science)
    airen.enroll(science)
    riecho.enroll(science)
    math.removeStudent(airen)
    dynmark.enroll(math)
    riecho.getListCourses()
    math.getListOfStudents()
    science.getListOfStudents()
}