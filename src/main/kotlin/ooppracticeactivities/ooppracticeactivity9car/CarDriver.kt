package ooppracticeactivities.ooppracticeactivity9car

fun main(){
    val newCar1 = Car("Ford","Mustang")
    println("*** First Constructor for Car ***")
    println("Car Make: ${newCar1.make}")
    println("Car Model: ${newCar1.model}")
    println("Car Year: ${newCar1.year}")
    println()
    val newCar2 = Car("Honda","Rush",2022)
    println("*** Second Constructor for Car ***")
    println("Car Make: ${newCar2.make}")
    println("Car Model: ${newCar2.model}")
    println("Car Year: ${newCar2.year}")

}