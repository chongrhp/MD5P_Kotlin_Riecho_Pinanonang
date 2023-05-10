package kotlinactivity

fun main(){
    var books = ArrayList<String>()
    var option = 'i'

    try {
        do{
            menuBook()
            option = readln().first()

            when(option){
                'a' -> addBook(books)
                'b' -> isBookInRecord(searchBook(),books)
                'c' -> removeBook(searchBook(), books)
                'd' -> println("Total book records: ${countBooks(books)}")
                'e' -> seachBookWildSearch(searchBook(), books)
                'f' -> searchBookName(searchBook(), books)
                'g' -> showBooks(books)
            }
        } while(option != 'x')
    } catch(e:Exception){
        println("Error message: ${e.message}")
    }

}

fun menuBook(){
    println()
    println("****** MENU *****")
    println("[a] Add new book")
    println("[b] Check book if is in the record")
    println("[c] remove book record")
    println("[d] Count the number of books")
    println("[e] Search books contains a string")
    println("[f] Search a book name")
    println("[g] list of books")
    println("[x] Exit application")
    print("Enter option: ")
}

fun isBookInRecord(search:String, books:ArrayList<String>):Boolean{
    var isInRecord = false
    for(i in 0..books.size-1){
        if(books[i] == search) isInRecord = true
    }

    println(isInRecord)
    return isInRecord
}

fun addBook(books:ArrayList<String>){
    println()
    print("Enter new book: ")
    var book = readln()
    books.add(book)
}

fun removeBook(search:String, books:ArrayList<String>){
    books.remove(search)
}

fun countBooks(book:ArrayList<String>):Int{
    return book.size
}
fun seachBookWildSearch(search:String, books:ArrayList<String>){
    println()
    for(srch in books) {
        if (srch.contains(search)) {
            println(srch)
        }
    }
}

fun searchBookName(search:String, books:ArrayList<String>){
    for(srch in books){
        if(srch == search) println(srch)
    }
}

fun searchBook():String{
    println()
    print("Enter search book: ")
    var search = readln()
    return search
}
fun showBooks(book:ArrayList<String>){
    println()
    for(i in 0..book.size-1){
        println("${i+1}. ${book[i]}")
    }
}