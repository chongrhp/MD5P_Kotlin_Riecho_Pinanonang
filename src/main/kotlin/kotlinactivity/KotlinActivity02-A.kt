package kotlinactivity

fun main(){
    var students = mutableListOf<List<Any>>()
    var option:Char = 'i'

    do{
        showMenu() //Show menu option
        option = readln().first()

        when(option){
            'a' -> students.add(studentAdd())
            'b' -> studentList(students)
        }

    } while(option != 'c')

}

fun studentList(list:MutableList<List<Any>>){

}
fun showMenu(){
    println("*** OPTION ***")
    println("a. Add student")
    println("b. List student")
    println("c. Exit option")
}

fun studentAdd():MutableList<Any>{
    var student = mutableListOf<Any>()
    println("Enter first name: ")
    var firstName = readln()
    println("Enter middle name: ")
    var middleName = readln()
    println("Enter last name: ")
    var lastName = readln()
    println("Address: ")
    var address = readln()
    println("Birth Date: ")
    var birthdate = readln()
    println("Course: ")
    var course = readln()
    println("Email address: ")
    var emailAdd = readln()
    println("Enter mobile no.: ")
    var mobilenumber = readln()

    student.add(firstName)
    student.add(middleName)
    student.add(lastName)
    student.add(address)
    student.add(birthdate)
    student.add(course)
    student.add(emailAdd)
    student.add(mobilenumber)

    return student
}