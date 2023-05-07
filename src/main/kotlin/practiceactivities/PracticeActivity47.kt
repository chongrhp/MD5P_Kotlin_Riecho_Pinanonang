package practiceactivities

fun main(){
    print("Enter a string: ")
    var myText = readln()

    val totalWords = countWords(myText)
    println("Number of words: $totalWords")
}

fun countWords(text:String):Int{
    var splitText = text.split(" ")
    val totalWords = splitText.size
    return totalWords
}