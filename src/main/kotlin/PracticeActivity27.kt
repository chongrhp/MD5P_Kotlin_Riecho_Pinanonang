fun main(){
    //Declare variables
    var number:Int = 0
    var squareOfNumber:Int = 0

    //Input matrix size
    print("\nEnter matrix to generate(b by n): ")
    number = readln().toInt()

    //process the square of input number
    squareOfNumber = number * number

    while(squareOfNumber > 0) {

        var ctr: Int = 0
        while (ctr < number) {
            print("${squareOfNumber}\t")
            ctr++
            squareOfNumber--
        }
        println()
    }
}