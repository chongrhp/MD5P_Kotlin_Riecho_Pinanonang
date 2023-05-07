package practiceactivities

fun main(){

    //Declare variables
    var baseSize:Int = 0
    var ctr:Int = 0
    var dollar:String = ""

    //Input the base size of dollar triable
    print("\nEnter base size of dollar triangle: ")
    baseSize = readln().toInt()

    //loop and display triangle
    while(ctr < baseSize){

        var ctr2:Int = 0
        while(ctr2 < baseSize){

                //Process and check if dollar sign is display
                if (ctr2 < baseSize - (ctr+1)) {
                    dollar = "  "
                } else {
                    dollar = " $"
                }
                print(dollar)
            ctr2++
        }
        //move to next line
        println()
        ctr++
    }
}