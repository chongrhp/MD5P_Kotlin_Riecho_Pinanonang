
fun main(){
    var column1 = arrayOf<Int>(25,24,23,22,21)
    var column2 = arrayOf<Int>(20,19,18,17,16)
    var column3 = arrayOf<Int>(15,14,13,12,11)
    var column4 = arrayOf<Int>(10,9,8,7,6)
    var column5 = arrayOf<Int>(5,4,6,2,1)

    var numberSeries:Int = 25
    var numberSize:Int = 5

    while(numberSeries > 0 ){

        var ctr2:Int = 0
        while(ctr2 < numberSize){
            print("${numberSeries}\t")
            ctr2++
            numberSeries--
        }
        println()
    }

    /*
    while(ctr < column1.size){
        print("${column1[ctr]}\t\t${column2[ctr]}\t\t${column3[ctr]}\t\t${column4[ctr]}\t\t${column5[ctr]}\n")
        ctr++
    } */
}