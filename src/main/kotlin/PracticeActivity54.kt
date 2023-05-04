fun main(){
   print("average is: ${calCulateAverage(2,3,4,5)}")
}
fun calCulateAverage(vararg numbers:Int):Double{
    var total = 0.0
    for(num in numbers){
        total += num
    }
    return total/numbers.size
}