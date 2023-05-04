fun main(){
    //List -immutable
    var beatles = listOf<String>("paul","john","ringo","ely")
    println("list size is ${beatles.size}")

    var ctr:Int = 0
    while(ctr < beatles.size){
        println(beatles[ctr])
        ctr++
    }
    println("***********\n")

    //list -mutable - can be changed
    var rivermaya = mutableListOf<String>("bamboo","rico","perf","juan")
    rivermaya.removeAt(0)
    rivermaya.remove("rico")
    rivermaya.add("john")
    rivermaya.add(2,"peter")

    var ctr2:Int = 0
    while(ctr2 < rivermaya.size){
        println(rivermaya[ctr2])
        ctr2++
    }
}