fun main(){
    var option:Char = 'a'
    var username:String = "librarian"
    var userpass:String = "librarian"
    var borrowers = mutableListOf<List<Any>>()

    do {
        menus()
        option = readln().first()

        when(option){
            'a' -> addBorrowers()
            'b' -> addBooks()
            'd' -> break
        }

        println()
    } while (option != 'x')

}

fun menus(){
    println("****MENU*****")
    println("a. books")
    println("b. barrowers")
    println("c. barroweds")
    println("d. exit")
    print("Enter option: ")
}

fun addBorrowers(){
    print("Enter barrower ID: ")
    var barrowerID = readln()
    print("Enter barrower name: ")
    var barrowerName = readln()

}
fun addBooks(){
    print("Enter book ID: ")
    var bookId = readln()
    print("Enter book Title: ")
    var bookTitle = readln()
    //books[bookId] = bookTitle
}

fun addBorrowed(){
    print("Enter book ID: ")
    var bookId = readln()
    print("Enter book Title: ")
    var bookTitle = readln()

}
