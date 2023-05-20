package casestudy.casestudyoop2

class Customer(name:String, email:String): Discount, User(){
    init {
        this.name = name
        this.email = email
    }

    override fun applyDiscount() {
        println("Applying 5% discount for customer: ${this.name}")
    }
}