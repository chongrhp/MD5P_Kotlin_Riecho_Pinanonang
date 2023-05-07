package practiceactivities

fun main(){
    //Activity 48

    print("Enter a string: ")
    var myString = readln()
    print("Enter a character: ")
    var myChar = readln().first()

    val totalChar = (myString myCharCount myChar)
    println("Character count: $totalChar")
}
infix fun String.myCharCount(thisChar:Char):Int{
    var charCount:Int = 0
    for(ch in this){
        if(thisChar == ch){
            charCount++
        }
    }

    return charCount
}
