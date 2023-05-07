package kotlinprogram

fun main(){

    print("string 1: ")
    var myStr1 = readln()
    print("string 2: ")
    var myStr2 = readln()

    var result = unionOfUniqueChars(myStr1,myStr2)
    println("Unique: $result")
}

fun unionOfUniqueChars(str1: String, str2:String): String{
    val set = mutableSetOf<Char>()
    for(chr in str1) {
        set.add(chr)
    }
    for(chr in str2){
        set.add(chr)
    }

    return set.joinToString("")
}