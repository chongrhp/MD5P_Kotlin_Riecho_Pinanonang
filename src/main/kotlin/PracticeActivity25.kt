fun main(){
    var baseSize:Int = 0
    var ctr:Int = 0
    var values:String = ""
    var printString:String = ""

    print("\nEnter base size of dollar triangle: ")
    baseSize = readln().toInt()

    while(ctr < baseSize){

        var ctr2:Int = 0
        while(ctr2 < baseSize){
                if (ctr2 < baseSize - (ctr+1)) {
                    values = " "
                } else {
                    values = "$"
                }
                print(values)
            ctr2++
        }
        println()
        ctr++
    }
}