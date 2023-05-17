package ooppracticeactivities.ooppracticeactivity14

class Administrator(var department:String):Employee() {
    override fun displayInfo(){
        super.displayInfo()
        println("My role is to administer my department $department office")
        println()
    }
}