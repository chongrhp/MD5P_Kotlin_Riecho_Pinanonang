fun main(){
    //outerloop
    var ctr1 = 0
    println()
    while (ctr1 < 10){
        //innerloop
        var ctr2 = 0
        while (ctr2 < 10){
            print("*")
            ctr2++
        }
        println()
        ctr1++
    }
}