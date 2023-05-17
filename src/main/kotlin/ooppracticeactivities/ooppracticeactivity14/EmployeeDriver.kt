package ooppracticeactivities.ooppracticeactivity14

fun main(){
    var teacher = Teacher("Mathematics")
    teacher.name = "Riecho Pinanonang"
    teacher.age = 38

    var administrator = Administrator("Budget")
    administrator.name = "Airen"
    administrator.age = 35

    teacher.displayInfo()
    administrator.displayInfo()
}