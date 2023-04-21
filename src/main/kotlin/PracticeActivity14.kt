fun main(){
    //initialize variables
    var year:Int = 0
    var condition1:Boolean = false
    var condition2:Boolean = false

    //Input variables
    print("\nEnter a year: ")
    year = readln().toInt()

    //process values
    condition1 = year % 4 == 0
    condition2 = year % 100 != 0 || year % 400 == 0

    //Check arguments and display output
    if(condition1 && condition2) {
        println("$year is leap year")
    } else {
        println("$year is not a leap year")
    }
}
