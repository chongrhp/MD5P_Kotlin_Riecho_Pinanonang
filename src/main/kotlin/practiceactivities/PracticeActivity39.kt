package practiceactivities

fun main(){
    var str:String = ""

    print("Enter a Text: ")
    str = readln()

    var reverseText = revText(str)
    println(reverseText)
}

fun revText(str:String):String{
    var ctr = str.length
    var reverse:String = ""
    while (ctr > 0){
        reverse = reverse.plus(str[ctr-1])
        ctr--
    }

    return reverse
}
