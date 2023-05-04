fun main(){
    print("Enter a string: ")
    var myString = readln()
    print("Enter a character: ")
    var myChar = readln().first()

    var totalCount = countOccurence(myString, myChar)
    println("Character count: $totalCount")
}

fun countOccurence(myS:String, myC:Char):Int{
    var charInt:Int = 0
    for(ch in myS){
        if(myC == ch) {
            charInt++
        }
    }

    return charInt
}