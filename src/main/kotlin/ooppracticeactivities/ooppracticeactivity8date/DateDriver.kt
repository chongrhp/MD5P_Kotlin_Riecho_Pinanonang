package ooppracticeactivities.ooppracticeactivity8date

fun main(){
    val newDate1 = Date()
    println("*** First Constructor for Date ****")
    println("Date is now: ${newDate1.month}/${newDate1.day}/${newDate1.year}")

    val newDate2 = Date(5,3,2023)
    println("*** First Constructor for Date ****")
    println("Date is now: ${newDate2.month}/${newDate2.day}/${newDate2.year}")


}