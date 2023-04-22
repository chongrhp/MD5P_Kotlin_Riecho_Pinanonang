fun main(){
    var topNames = mutableMapOf<String, Double>()
    var name:String = ""
    var sale:Double = 0.0

    for(counter in 1..5) {
        print("\nEnter athlete $counter: ")
        name = readln()
        print("Enter Sales: ")
        sale = readln().toDouble()

        topNames[name] = sale
    }

    println("\nTop SportsMan")
    println("Name\t\t\tSales")
    println("===========================")

    for((names, sales) in topNames){
        println("$names\t\t\t$sales")
    }
}

