package practiceactivities

fun main(){
    //Declare variables
    var number:Int = 0

    //Input value
    print("\nEnter a positive integer: ")
    number = readln().toInt()

    //loop and display add number during process
    repeat(number){loop ->

        if(loop % 2 != 0){
            print("$loop ")
        }

    }
}