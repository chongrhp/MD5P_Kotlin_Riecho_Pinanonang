import kotlin.system.exitProcess

fun main(){
    var shoesbrand =  arrayOf<String>("Adidas","Nike","Fila","Levis","Sketchers")

    //ArrayOf
    println("list of shoes brand using arrayOf:")
    for(i in 0 ..shoesbrand.size-1){
        if(i > 0) print(",")
        print(shoesbrand[i])
    }

    println()
    println()
    //ArrayList
    println("List of students using ArrayList")
    var students = ArrayList<String>()
    for(i in 1..5){
        print("Enter student name:")
        students.add(readln())
    }
    println(students)


    //mutableSetOf
    var fruits = mutableSetOf<String>("Apple","Orange","Mango")
    fruits.add("Grapes")
    fruits.remove("Orange")

    println()
    println("List of fruits using setOf")
    var ctr:Int = 0
    while(ctr < fruits.size){
        println(fruits.elementAt(ctr))
        ctr++
    }

    //MutableMapOf
    var products = mutableMapOf<String, String>()
    var barcode:String = ""
    println()
    println("Enter list of producst using mutableMapOf")
    for(i in 1..5) {
        print("Enter barcode number: ")
        barcode = readln()
        print("Enter product name: ")
        products[barcode] = readln()
    }
}