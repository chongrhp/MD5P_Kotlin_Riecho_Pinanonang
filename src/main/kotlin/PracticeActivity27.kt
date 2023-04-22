fun main(){
    var number:Int = 0
    var squareOfNumber:Int = 0


    print("\nEnter matrix to generate(b by n): ")
    number = readln().toInt()
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