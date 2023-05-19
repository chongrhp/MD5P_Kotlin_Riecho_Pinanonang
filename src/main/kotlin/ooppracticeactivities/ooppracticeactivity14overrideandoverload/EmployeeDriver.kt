package ooppracticeactivities.ooppracticeactivity14overrideandoverload

fun main(){
    var teacher = Teacher("Mathematics")
    teacher.name = "Riecho Pinanonang"
    teacher.age = 38

    var administrator = Administrator("Human Resource Management")
    administrator.name = "Airen"
    administrator.age = 35

    teacher.displayInfo()
    administrator.displayInfo()

}