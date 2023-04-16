fun main(){
    // if else if statement
    //age 0 - 12 -> Kids
    //age 13 - 18 -> Teenagers
    //age 19 - 59 -> Adult
    //age 60 and above -> Senior Citizen
    //less than 0 -> Invalid age

    var age: Int = 0
    print("Please Enter your age: ")
    age = readln().toInt()

    if (age >= 60){ println("Senior Citizen") }
    else if (age >= 18){ println("Adults") }
    else if (age >= 13){ println("Teenagers")}
    else if(age>= 0){ println("Kids")}
    else { println("Invalid age")}
}