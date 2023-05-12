package ooppracticeactivities.ooppracticeactivity9car

class Car {
    var make:String
    var model:String
    var year:Int

    constructor(make:String, model:String){
        this.make = make
        this.model = model
        year = 2023
    }

    constructor(make:String, model:String, year:Int){
        this.make = make
        this.model = model
        this.year = year
    }

}