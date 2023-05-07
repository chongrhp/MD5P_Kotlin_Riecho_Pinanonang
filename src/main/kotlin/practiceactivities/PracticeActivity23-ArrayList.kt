package practiceactivities

fun main(){
    //Declare array numbers and variables
    var number = ArrayList<Int>()
    var countEvenNumber:Int = 0
    var ctr:Int = 0

    //loop input values
    while(ctr < 5){
        print("Enter number 1: ")
        number.add(readln().toInt())

        //check if number entered is divisible by 2
        if(number[ctr] % 2 == 0){
            countEvenNumber++
        }

        ctr++
    }

    //display output even numbers
    println("The number of even numbers are: $countEvenNumber")
}