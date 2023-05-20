package ooppracticeactivities.ooppracticeactivity16

fun main(){
    val car = Car()
    car.updateBrand("Ford")
    car.updateYear(2021)
    car.displayDetails()
    car.start()
    car.accelerate()
    car.stop()

    println()
    val motorcycle = Motorcycle()
    motorcycle.updateBrand("Honda")
    motorcycle.updateYear(2020)
    motorcycle.displayDetails()
    motorcycle.start()
    motorcycle.accelerate()
    motorcycle.stop()
}