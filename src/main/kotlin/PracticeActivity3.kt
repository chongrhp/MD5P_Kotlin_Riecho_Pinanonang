fun main () {
    //initialize variables
    var item:String = ""
    var priceDay1:Double = 0.0
    var priceDay2:Double = 0.0
    var priceDay3:Double = 0.0
    var averagePrice:Double = 0.0

    //Input variables
    print("\nEnter item: ")
    item = readln()
    print("Price in day 1: ")
    priceDay1 = readln().toDouble()
    print("Price in day 2: ")
    priceDay2 = readln().toDouble()
    print("Price in day 3: ")
    priceDay3 = readln().toDouble()

    //Process average price
    averagePrice = (priceDay1+priceDay2+priceDay3)/3

    println("\nAverage price of $item is ${String.format("%.2f",averagePrice)}")

}