fun main(){
    var option:Char = 'a'
    var fahrenheit:Double = 0.0
    var celsius:Double = 0.0

    do {
        println("\nMain Menu")
        println("a. Celsius to Fahrenheit")
        println("b.Fahrenheit to Celsius")
        println("c. Exit")
        print("Choose option [a,b or c]: ")
        option = readln().first()

        if(option == 'a') {

            println("\nCelsius - Fahrenheit Conversion")
            print("Enter Celsius: ")
            celsius = readln().toDouble()

            fahrenheit = ((9.0 / 5.0) * celsius) + 32.0
            println("Fahrenheit equivalent is ${String.format("%.2f", fahrenheit)}")
        } else if (option == 'b'){

            println("\nFahrenheit - Celsius Conversion")
            print("Enter fahrenheit: ")
            fahrenheit = readln().toDouble()

            celsius = (fahrenheit - 32.0) * (5.0/9.0);
            println("Celsius equivalent is ${String.format("%.2f", celsius)}")
        }

    } while(option != 'c')

}