package practiceactivities

fun main(){
    //Declare variables
    var number:Int = 0
    var squareOfNumber:Int = 0

    //Input matrix size
    print("\nEnter matrix to generate(b by n): ")
    number = readln().toInt()

    //process the square of input number
    squareOfNumber = number * number

    var line:Int = number
    while(squareOfNumber > 0) {

        var ctr: Int = 0
        var showOutput:String = ""
        while (ctr < number) {

            if (line % 2 == 0){
                //even numbers
                if(showOutput != "") showOutput = showOutput + "\t"
                showOutput = showOutput + squareOfNumber
            }
            else {
                //add numbers
                if(showOutput != "") showOutput = "\t" + showOutput
                showOutput = squareOfNumber.toString() + showOutput
            }
            ctr++
            squareOfNumber--
        }

        //breakline
        line--
        println(showOutput)
    }
}