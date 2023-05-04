fun main(){
    print("Enter a tring: ")
    var helloWorld = readln()
    println("String with spaces replaces: ${replaceSpace(helloWorld)}")
}

fun replaceSpace(varStr:String):String{
    val newString = varStr.replace(" ", "_")
    return newString
}