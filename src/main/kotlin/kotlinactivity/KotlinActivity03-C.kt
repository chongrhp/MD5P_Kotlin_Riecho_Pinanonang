fun main(){
    var products = ArrayList<String>()
    val cart = HashMap<String, Int>()
    var option = 'i'

    try {
        do {
            menuProducts()
            option = readln().first()

            when(option){
                'a' -> addToCart(cart)
                'b' -> checkOut(cart)
                'c' -> removeFromCart(item(),cart)
            }
        } while (option != 'x')
    } catch (e:Exception){
        println("Error message: ${e.message}")
    }

}

fun menuProducts(){
    println()
    println("*** Menu Products ***")
    println("[a] Add to cart")
    println("[b] Check out cart")
    println("[c] Remove Cart")
    println("[x] Exit option")
    print("Select option: ")
}

fun addToCart(prod:HashMap<String, Int>){
    println()
    print("Enter product: ")
    var product = readln()
    print("Quantity: ")
    var qty = readln().toInt()
    prod.put(product,qty)
}

fun checkOut(prod:HashMap<String, Int>){
    var total = 0
    println("List of items on Cart")
    for((key, value) in prod){
        total += value
    }

    println("Total items: $total")
}

fun removeFromCart(item:String, prod:HashMap<String, Int>){
    prod.remove(item)
}

fun item():String{
    println("Select item: ")
    var i = readln()
    return i
}