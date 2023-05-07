package practiceactivities

fun main(){
    print("Temperature (Celsius): ")
    var celsius = readln().toDouble()
    val celToFahr = convertTemperature(celsius)

    println("Temperature (Fahrenheit): $celToFahr")
}

fun convertTemperature(cels:Double):Double{
    val fahrenheit = (cels * (9.0/5.0))+32.0
    return fahrenheit
}
