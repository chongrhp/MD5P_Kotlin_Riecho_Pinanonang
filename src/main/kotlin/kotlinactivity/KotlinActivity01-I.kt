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
            }
        } while (option != 'x')
    }
}

fun findborrower(borrowerID:String,list:MutableMap<String, List<Any>>):Boolean{
    var found:Boolean = false
    for((key, value) in list){
        if(key == borrowerID){
            found = true
            break
        }
    }
    return found
}


fun menus(){
    println()
    println("**** MENU *****")
    println("[a] new books")
    println("[b] new borrowers")
    println("[c] books list")
    println("[d] borrowers list")
    println("[e] borrow book")
    println("[f] book borrowers")
    println("[g] borrower books")
    println("[x] Exit")
    print("Enter option: ")
}

fun bookBorrowersList(book:MutableMap<String, List<Any>>, borrower:MutableMap<String, List<Any>>, trans:MutableList<MutableList<Any>>){
    print("Enter bookID: ")
    var bookID = readln()


    for ((bokid, booktitle) in book){
        if(bokid == bookID){
            println(booktitle)
            println(trans)
            break
        }
    }

    for(i in 0 ..trans.size-1){
        if((trans[i].size -1) > 0) {
            if(trans[i][1] == bookID) {
                println("${trans[i][0]}, ${trans[i][1]}, ${trans[i][2]}")
                for ((bor, value) in borrower) {
                    if (bor == bookID) {
                        //print("${trans[i][0]} = $bor")
                        println(value)
                    }
                }
                break
            }

        }
    }

}

fun findbook(bookID:String,list:MutableMap<String, List<Any>>):Boolean{
    var found:Boolean = false
    for((key, value) in list){
        if(key == bookID){
            found = true
            break
        }
    }
    return found
}
fun borrowerBooks(book:MutableMap<String, List<Any>>, borrower:MutableMap<String, List<Any>>, transaction:MutableList<MutableList<Any>>){

    var bookID:String = ""
    var borrowerId:String = ""
    var trans = mutableListOf<Any>()
    var trxId = transaction.size-1
    var trxChild = transaction[0].size -1
    trxId++
    var foundbook = false
    var foundborrower = false
    do {
        print("Enter bookId: ")
        bookID = readln()
        if(!findbook(bookID,book)){
            println("Sorry! Cannot find book on the list.")
            print("Continue y/n?")
            var yn = readln().first()
            if(yn == 'n') break
        } else {foundbook = true}

    } while(!foundbook)

    do {
        print("Enter borrowerID: ")
        borrowerId = readln()
        if(!findborrower(borrowerId, borrower)){
            println("Sorry! Cannot find borrower's ID on the list.")
            print("Continue y/n?")
            var yn = readln().first()
            if(yn == 'n') break
        } else {foundborrower = true}
    } while(!foundborrower)

    if(foundborrower && foundborrower) {
        print("Enter date: ")
        var trxDate = readln()


        trans.add(trxId)
        trans.add(bookID)
        trans.add(borrowerId)
        trans.add(trxDate)
        if(trxChild == 0){transaction[0] = trans}
        else {transaction.add(trans)}
    }
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
    println("Borrowers List")
    for((key, value) in list){
        print("$key,  $value")
    }
    println()
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
    println("Books List")
    for((key, value) in list){
        print("$key,  $value")
    }
    println()
}


