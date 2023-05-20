package casestudy.casestudyoop2

class ShoppingCart {
    var books = mutableListOf<Book>()
    fun addToCart(book: Book){
        println("Book added to cart: ${book.title}")
        books.add(book)
    }

    fun removeFromCart(book:Book){
        println("Book removed from cart: ${book.title}")
        books.remove(book)
    }

    fun displayCart(){
        for(book in books){
            book.displayDetails()
        }
    }

}