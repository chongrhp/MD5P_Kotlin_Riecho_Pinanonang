package ooppracticeactivities.ooppracticeactivity14

class Teacher(var subject:String):Employee() {
    override fun displayInfo(){
        super.displayInfo()
        println("My role is to teach the $subject subject")
        println()
    }
}