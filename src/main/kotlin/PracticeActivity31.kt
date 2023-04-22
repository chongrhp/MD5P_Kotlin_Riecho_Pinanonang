fun main(){
    var setA = ArrayList<Int>()
    var setB = ArrayList<Int>()

    println("\nValues for Set A")
    for(counter in 1..5){
        print("Enter number $counter: ")
        setA.add(readln().toInt())
    }

    println("\nValues for Set B")
    for(counter in 1 .. 5){
        print("Enter number $counter: ")
        setB.add(readln().toInt())
    }

    var intersectSet = setA.intersect(setB)
    println("\nIntersection of the sets: $intersectSet")
}