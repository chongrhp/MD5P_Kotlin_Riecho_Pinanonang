package kotlinprogram

fun main(){
    //Null safety
    //null - this is the absence of a value
    //Null Pointer Exception - NPE
    // ? -> your variable is a nullable type
    var name:String? = null  //nullable

    print("Enter your name: ")
    name = readln()

    println("Hello $name")
}