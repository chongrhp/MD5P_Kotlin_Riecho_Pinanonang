package kotlinactivity
fun main(){
    var names = ArrayList<String>()
    var option = 'i'

    try {
        do {
            menuStudent()
            option = readln().first()

            when (option) {
                'a' -> addStudent(names)
                'b' -> isStudentInRecord(searchStudent(), names)
                'c' -> removeStudent(searchStudent(), names)
                'd' -> println("Total student records: ${countStudent(names)}")
                'e' -> searchStudentWildSearch(searchStudent(), names)
                'f' -> searchStudenName(searchStudent(), names)
                'g' -> showStudents(names)

            }
        } while (option != 'x')
    }catch(e:Exception){
        println("Error message: ${e.message}")
    }
    
}

fun menuStudent(){
    println()
    println("****** MENU *****")
    println("[a] Add new student")
    println("[b] Check Student if is in the record")
    println("[c] remove student record")
    println("[d] Count the number students")
    println("[e] Search students contains a string")
    println("[f] Search a student name")
    println("[g] list of students")
    println("[x] Exit application")
    print("Enter option: ")
}

fun isStudentInRecord(student:String, list:ArrayList<String>):Boolean{
    var isInRecord = false
    var i = 0
    while(i < list.size){
        if(list[i] == student){
            isInRecord = true
            break
        }
        i++
    }
    println(isInRecord)
    return isInRecord
}

fun addStudent(name:ArrayList<String>){
    println()
    print("Enter new student: ")
    name.add(readln())
}

fun removeStudent(search:String, name:ArrayList<String>){
    name.remove(search);
}

fun countStudent(name:ArrayList<String>):Int{
    return name.size
}

fun searchStudentWildSearch(search:String, name:ArrayList<String>){
    println()
    for (srch in name){
        if(srch.contains(search)){
            println(srch)
        }
    }

}

fun searchStudenName(search:String, name:ArrayList<String>){
    for(srch in name){
        if(srch == search) println(srch)

    }
}

fun searchStudent():String{
    println()
    print("Enter search name: ")
    var search = readln()
    return search
}

fun showStudents(name:ArrayList<String>){
    println()
    for(i in 0 ..name.size-1){
        println("${i+1}. ${name[i]}")
    }
}