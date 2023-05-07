package practiceactivities

fun main(){
    var setA = ArrayList<Int>()
    var setB = ArrayList<Int>()

    //Setting values for set A
    println("\nValues for Set A")
    for(counter in 1..5){
        print("Enter number $counter: ")
        setA.add(readln().toInt())
    }

    //Setting values for set B
    println("\nValues for Set B")
    for(counter in 1 .. 5){
        print("Enter number $counter: ")
        setB.add(readln().toInt())
    }

    //Get intersection and display
    var intersectSet = setA.intersect(setB)
    println("\nIntersection of the sets: $intersectSet")
}