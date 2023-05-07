package practiceactivities

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
    topNames = topNames.toSortedMap()

    println("\nTop SportsMan")
    println("Name\t\t\tSales")
    println("===========================")

    var totalSales:Double = 0.0
    for((names, sales) in topNames){
        println("$names\t\t\t$${String.format("%,.2f",sales)}")
        totalSales+= sales
    }
    println("===========================")
    println("Total\t\t\t$${String.format("%,.2f",totalSales)}")
}

