fun main(){
    var age: Int = 0
    print("Please Enter your age: ")
    age = readln().toInt()

    if(age >= 18){
        println("Your age is $age")
        println("You are qualified to vote")
    }

    println("This will alway display")
}