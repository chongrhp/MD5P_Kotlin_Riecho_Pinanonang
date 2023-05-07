fun main(){

    var borrowers = mutableMapOf<String, List<Any>>()
    var books = mutableMapOf<String, List<Any>>()


    var username:String = "librarian"
    var password:String = "librarian"
    var isLoggin:Boolean = false

    while(!isLoggin){
        print("Enter user name: ")
        var logusername = readln()
        print("Enter password: ")
        var logpassword = readln()

        if(logusername == username && logpassword == password){
            isLoggin = true
        }else {
            println("Wrong user name and password...")
        }
    }

    if(isLoggin){
        var option:Char = 'i'
        do {
            menus()
            option = readln().first()

            when(option){
                'a' -> addBooks(books)
                'b' -> addBorrowers(borrowers)
                'c' -> bookslist(books)
                'd' -> borrowerslist(borrowers)
            }

            println()
        } while (option != 'x')
    }



}

fun menus(){
    println("**** MENU *****")
    println("a. books")
    println("b. borrowers")
    println("c. books list")
    println("d. borrowers list")
    println("x. Exit")
    print("Enter option: ")
}

fun addBorrowers(list:MutableMap<String, List<Any>>){
    var borrowerlist = mutableListOf<String>()

    var borrowerID = ""
    var borrowerName = ""
    var borrowerAddress = ""
    print("Enter borrower ID: ")
    borrowerID = readln()
    print("Enter borrower name: ")
    borrowerName = readln()
    print("borrowers address: ")
    borrowerAddress = readln()

    borrowerlist.add(borrowerName)
    borrowerlist.add(borrowerAddress)
    list.put(borrowerID, borrowerlist)

}

fun borrowerslist(list:MutableMap<String, List<Any>>){
    for((key, value) in list){
        print("$key,  $value")
    }
}

fun addBooks(list:MutableMap<String, List<Any>>){
    var book = mutableListOf<String>()
    var bookID:String = ""
    print("Enter book ID: ")
    bookID = readln()
    print("Enter book Title: ")
    book.add(readln())
    print("Author: ")
    book.add(readln())

    list.put(bookID, book)
}

fun bookslist(list:MutableMap<String, List<Any>>){
    for((key, value) in list){
        print("$key,  $value")
    }
}


fun addBorrowed(){
    print("Enter book ID: ")
    var bookId = readln()
    print("Enter book Title: ")
    var bookTitle = readln()

}
