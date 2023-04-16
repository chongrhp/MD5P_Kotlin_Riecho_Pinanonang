fun main(){
    //initialize variables
    var productName:String = ""
    var productPrice:Double = 0.0
    var discountPrice:Double = 0.0
    var discount:Double = 0.0
    var netPrice:Double = 0.0

    //Input variables
    print("Enter product: ")
    productName = readln()
    print("Enter price: ")
    productPrice = readln().toDouble()

    //Check argument if discount is available
    if (productPrice <= 10000){discountPrice = 0.0}
    else if (productPrice <= 20000 || productPrice >= 10001) {discountPrice = productPrice * 0.05}
    else if (productPrice <= 50000 || productPrice >= 20001 ){discountPrice = productPrice * 0.1}
    else if (productPrice <= 100000 || productPrice >= 50001){discountPrice = productPrice * 0.15}
    else if (productPrice > 100000) {discountPrice = productPrice * 0.20}

    //Get the value of discounted price
    netPrice = productPrice - discountPrice

    println("Price of $productName is $productPrice")
    println("Discount is ${String.format("%,.2f",discountPrice)}")
    println("Net Price is ${String.format("%,.2f",netPrice)}")
}


