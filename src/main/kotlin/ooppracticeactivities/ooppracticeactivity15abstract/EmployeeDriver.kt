package ooppracticeactivities.ooppracticeactivity15abstract

fun main(){
     val employeeFullTime = FullTimeEmployee("Juan Dela Cruz",26)
     val employeeParTime = PartTimeEmployee("Maria Dela Cruz",25)
    println()
    println("----- FULL TIME EMPLOYEE -----")
    println("Employee Name:  ${employeeFullTime.getName()}")
    println("Per day:  ${String.format("%.2f",employeeFullTime.getSalary())}")
    println("Number of days:  ${employeeFullTime.days}")
    println("Total monthly earnings:  ${String.format("%,.2f",employeeFullTime.calculateEarnings())}")
    println()
    println("----- PART TIME EMPLOYEE -----")
    println("Employee Name: ${employeeParTime.getName()}")
    println("Per hour:  ${String.format("%.2f",employeeParTime.getSalary())}")
    println("Number of hours:  ${employeeParTime.hours}")
    println("Total monthly earnings: ${String.format("%,.2f",employeeParTime.calculateEarnings())}")
    employeeParTime.calculateEarnings()
 }