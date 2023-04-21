fun main(){
    //initialize variable
    var inputNumber:Int = 0
    var dayOfTheWeek:String = ""

    //Input variables
    print("\nEnter a number between 1 and 7: ")
    inputNumber = readln().toInt()

    //Process the input value
    when (inputNumber){
        1 -> {
            dayOfTheWeek = "Monday"
        } 2 -> {
            dayOfTheWeek = "Tuesday"
        } 3 -> {
            dayOfTheWeek = "Wednesday"
        } 4 -> {
            dayOfTheWeek = "Thursday"
        } 5 -> {
            dayOfTheWeek = "Friday"
        } 6 -> {
            dayOfTheWeek = "Saturday"
        } 7 -> {
            dayOfTheWeek = "Sunday"
        } else -> {
            dayOfTheWeek = "error"
        }
    }

    //Display the output processed value
    println("The corresponding day of the week is $dayOfTheWeek")

}