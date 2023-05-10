fun main(){

    var borrowers = mutableMapOf<String, List<Any>>()
    var books = mutableMapOf<String, List<Any>>()
    var borrowbooks = mutableListOf(mutableListOf<Any>())


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
            println()

            when(option){
                'a' -> addBooks(books)
                'b' -> addBorrowers(borrowers)
                'c' -> bookslist(books)
                'd' -> borrowerslist(borrowers)
                'e' -> borrowerBooks(books,borrowers,borrowbooks)
                'f' -> bookBorrowersList(books,borrowers,borrowbooks)
                'g' -> borrowerBooksList(books, borrowers, borrowbooks)
            }
        } while (option != 'x')
    }
}
