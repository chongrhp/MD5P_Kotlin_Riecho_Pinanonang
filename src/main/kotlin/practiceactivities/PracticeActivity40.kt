package practiceactivities

fun main(){
    print("Enter a string: ")
    var str:String = readln()
    var removeDuplicate = removeDuplicateChars(str)
    println("String with duplicates removed: $removeDuplicate")
}

fun removeDuplicateChars(str: String): String {
    val charSet = mutableSetOf<Char>()
    val result = StringBuilder()
    for (char in str) {
        if (charSet.add(char)) {
            result.append(char)
        }
    }
    return result.toString()
}