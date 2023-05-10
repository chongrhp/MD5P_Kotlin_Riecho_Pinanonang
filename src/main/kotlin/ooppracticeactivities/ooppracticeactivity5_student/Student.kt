package ooppracticeactivities.ooppracticeactivity5_student

class Student(name:String, age:Int, grade:Int) {
    var name:String
    var age:Int
    var grade:Int

    init {
        this.name = name
        this.age = age
        this.grade = grade
    }

    fun promote(){
        this.grade ++
        println("Your grade is : ${this.grade}")
    }
}