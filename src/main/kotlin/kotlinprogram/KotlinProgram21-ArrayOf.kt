package kotlinprogram

fun main(){
    //only Strings
    var names = arrayOf<String>("paul","john","ringo","ely")

    //any data types
    //var names = arrayOf("paul","john","ringo","ely")

    println("array size is ${names.size}")

    var ctr:Int = 0
    while(ctr < names.size) {
        println(names[ctr])
        ctr++
    }
}