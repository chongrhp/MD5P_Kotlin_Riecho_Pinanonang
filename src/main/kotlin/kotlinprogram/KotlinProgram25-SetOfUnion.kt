package kotlinprogram

fun main(){
    var setA = setOf(1,2,3,4,5)
    var setB = setOf(4,5,6,7,8)

    //union
    var unionSet = setA.union(setB)
    println("union - $unionSet")

    //intersection
    var intersectSet = setA.intersect(setB)
    println("intersection = $intersectSet")

    //difference
    var diffSet = setA.subtract(setB)
    println("difference of Set A from set B is $diffSet")

    //difference
    var diffSet2 = setB.subtract(setA)
    println("difference of Set B from set A is $diffSet2")

    //Symmetric difference - its on set a or set b but not in both
    println("symmetric difference ${diffSet.union(diffSet2)}")
}