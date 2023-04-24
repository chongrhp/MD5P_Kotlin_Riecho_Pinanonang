fun main(){
    //Input value of a string
    print("\nEnter a string: ")
    val inputString = readln()

    //process and display reverse string
    var ctr:Int = inputString.length
    while (ctr > 0 ) {
        print(inputString[ctr-1])
        ctr--
    }
}