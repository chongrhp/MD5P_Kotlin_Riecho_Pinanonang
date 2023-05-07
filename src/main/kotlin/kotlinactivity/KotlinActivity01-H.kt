import kotlin.math.min

fun main(){
    //input
    print("Enter number 1: ")
    var num1 = readln().toInt()
    print("Enter number 2: ")
    var num2 = readln().toInt()

    val numlist = listOf<Int>(num1,num2)
    val sortedlist = numlist.sorted()
    println("lowest ${sortedlist[0]}")
    println("highest ${sortedlist[sortedlist.size-1]}")
    println("prime number ${getPrimes(sortedlist[0], sortedlist[sortedlist.size-1])}")
}

fun getPrimes(low:Int, high: Int):List<Int>{
    val primes = mutableListOf<Int>()
    for (num in low..high){
        var isPrime = true
        for(i in low until num){
            if(num % i == 0){
                isPrime = false
                break
            }
        }
        if (isPrime) primes.add(num)
    }
    return primes
}