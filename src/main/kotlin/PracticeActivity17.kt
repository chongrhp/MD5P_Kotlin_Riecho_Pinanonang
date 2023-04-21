fun main(){

    //Declare variables
    var control: Int = 0
    var number: Int = 0
    var totalNumbers : Double = 0.0
    var average:Double = 0.0

    while(control < 5){

        //Enter the value of series numbers
        print("Enter number ${control + 1}: ")
        number  = readln().toInt()

        //process total numbers
        totalNumbers = totalNumbers + number

        control++
    }

    //process average
    average = totalNumbers/control

    //Display average output
    println("Total average is  $average")
}