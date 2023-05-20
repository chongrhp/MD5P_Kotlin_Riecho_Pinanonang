package casestudy.casestudyoop2

class FictionCategory(name:String) : Discount, Category() {

    init {
        this.name = name
    }
    override fun displayCategory() {
        println("Category: ${this.name}")
    }

    override fun applyDiscount() {
        println("Applying 10% discount for Fiction category")
    }
}