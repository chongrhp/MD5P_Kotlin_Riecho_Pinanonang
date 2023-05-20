package casestudy.casestudyoop2

class NonFictionCategory(name:String) : Category() {

    init{
        this.name = name
    }
    override fun displayCategory() {
        println("Category: ${this.name}")
    }


}