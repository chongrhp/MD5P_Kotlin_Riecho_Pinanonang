package ooppracticeactivities.ooppracticeactivity14overrideandoverload

class Teacher(var subject:String):Employee() {
    override fun displayInfo(){
        this.role = "Teacher"
        println("===== TEACHER CLASS ======")
        super.displayInfo()
        println("Description: Teaching subject $subject")
        println()
    }
}