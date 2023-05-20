package casestudy.casestudyoop2

class Book(title:String,
           author: String,
           price:Double,
           quantity:Int) {
    var title:String
    var author: String
    var price:Double
    var quantity: Int

    init {
        this.title = title
        this.author = author
        this.price = price
        this.quantity = quantity
    }

    fun displayDetails(){
        println("Title: $title")
        println("Author: $author")
        println("Price: $price")
        println("Quantity: $quantity")
    }


}