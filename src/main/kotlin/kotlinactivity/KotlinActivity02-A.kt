package kotlinactivity

fun main(){
    var students = mutableListOf<List<Any>>()
    var option:Char = 'i'

    do{
        showMenu() //Show menu option
        option = readln().first()
        println()

        when(option){
            'a' -> students.add(studentAdd())
            'b' -> studentList(students)
        }

    } while(option != 'x')

}

fun studentList(list:MutableList<List<Any>>){
    for(i in 0..list.size -1){
         if(list[i].size -1 > 0){
             println("$i. Name: ${list[i][0]} ${list[i][1]} ${list[i][2]}" +
                     ", Address: ${list[i][3]}, Birth date: ${list[i][4]}" +
                     ", Course: ${list[i][5]}, Email: ${list[i][6]}" +
                     ", Contact No.: ${list[i][7]}")
         }
    }
    println()

}

fun showMenu(){
    println("**** OPTION ****")
    println("[a] Add student")
    println("[b] List student")
    println("[x] Exit option")
    print("Enter you option: ")
}

fun studentAdd():MutableList<Any>{
    var student = mutableListOf<Any>()
    print("Enter first name: ")
    var firstName = readln()
    print("Enter middle name: ")
    var middleName = readln()
    print("Enter last name: ")
    var lastName = readln()
    print("Address: ")
    var address = readln()
    print("Birth Date: ")
    var birthdate = readln()
    print("Course: ")
    var course = readln()
    print("Email address: ")
    var emailAdd = readln()
    print("Enter mobile no.: ")
    var mobilenumber = readln()

    println()
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