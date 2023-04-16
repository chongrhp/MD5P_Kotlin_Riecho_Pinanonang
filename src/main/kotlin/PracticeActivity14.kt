fun main(){
    //initialize variables
    var year:Int = 0

    //Input variables
    print("\nEnter a year: ")
    year = readln().toInt()

    //Check arguments and display output
    if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        println("$year is leap year")
    } else { println("$year is not a leap year")}
}
