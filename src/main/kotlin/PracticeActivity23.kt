fun main(){
    //Declare array numbers and variables
    var number = ArrayList<Int>()
    var countEvenNumber:Int = 0
    var ctr:Int = 0

    while(ctr < 5){
        print("Enter number 1: ")
        number.add(readln().toInt())

        if(number[ctr] % 2 == 0){
            countEvenNumber++
        }

        ctr++
    }

    println("The number of even numbers are: $countEvenNumber")
}