package kotlinprogram

fun main(){
    //maps - key - value pair structure immutable
    //<key> to <value>
    //traverse
    var fruits = mapOf('a' to "apple", 'b' to "banna", 'c' to "grapes")
    println(fruits['b'])
    println(fruits)

    for((id, element) in fruits){
        println("Key is $id and Value is $element")
    }

    var fruits2 = mutableMapOf<Int, String>()
    fruits2[1] = "Melon"
    fruits2[2] = "Watermelon"
    fruits2[5] = "Papaya"
    println(fruits2)
    fruits2.remove(2)
    fruits2.replace(5,"Tamarind")
    println(fruits2)
}