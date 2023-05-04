fun main(){
    var eggs:Int = 0

    print("Enter the number of eggs: ")
    eggs = readln().toInt()

    var dozen = totalDozen(eggs)
    var lessEgss = lessDozen(eggs,dozen)

    println("Number of dozen: $dozen")
    println("Eggs less than a dezen: $lessEgss")
}

fun totalDozen(egg:Int):Int{
    var doz = egg/12
    return doz
}

fun lessDozen(eggs:Int, doz:Int):Int{
    var less = eggs - (doz*12)
    return less
}