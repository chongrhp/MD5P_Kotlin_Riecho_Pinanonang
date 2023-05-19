package ooppracticeactivities.ooppracticeactivity15abstract

class PartTimeEmployee(
        private val name:String,
        val hours:Int) : Employee() {

    private val salary:Double

    init{
        salary = 150.00 //per hour
    }
    override fun calculateEarnings():Double{
        return salary * hours
    }

    fun getName():String{
        return name
    }

    fun getSalary():Double{
        return salary
    }

}