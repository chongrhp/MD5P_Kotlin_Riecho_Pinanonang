package ooppracticeactivities.ooppracticeactivity8date

import java.time.LocalDate

class Date {
    var day:Int
    var month:Int
    var year:Int
    constructor(){
        val currentDate = LocalDate.now()
        this.day = currentDate.dayOfMonth
        this.month = currentDate.monthValue
        this.year = currentDate.year
    }

    constructor(month:Int, day:Int, year:Int){
        this.month = month
        this.day = day
        this.year = year
    }
}