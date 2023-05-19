package ooppracticeactivities.ooppracticeactivity15abstract

class FullTimeEmployee(
        private val name:String,
        val days:Int) : Employee() {
    private val salary:Double

    init{
        salary = 900.00 //per day
    }
    override fun calculateEarnings():Double{
        return salary * days
    }

    fun getSalary():Double{
        return salary
    }
    fun getName():String{
        return name
    }
}