package ooppracticeactivities.ooppracticeactivity14

class Administrator(var department:String):Employee() {
    override fun displayInfo(){
        this.role = "Administrator"
        println("===== ADMINISTRATOR CLASS ======")
        super.displayInfo()
        println("Description: Administering $department office")
        println()
    }
}