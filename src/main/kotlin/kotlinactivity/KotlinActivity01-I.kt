fun main(){
    var option:Char = 'a'

    do {
        menus()
        option = readln().first()

        when(option){
            'a' -> addBarrowers()
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
fun addBarrowers(){
    print("Enter barrower ID: ")
    var barrowerID = readln()
    print("Enter barrower name: ")
    var barrowerName = readln()
    //barrowers[barrowerID] = barrowerName
}
fun addBooks(){
    print("Enter book ID: ")
    var bookId = readln()
    print("Enter book Title: ")
    var bookTitle = readln()
    //books[bookId] = bookTitle
}

fun addBarrowed(){
    print("Enter book ID: ")
    var bookId = readln()
    print("Enter book Title: ")
    var bookTitle = readln()
    //books[bookId] = bookTitle
}
