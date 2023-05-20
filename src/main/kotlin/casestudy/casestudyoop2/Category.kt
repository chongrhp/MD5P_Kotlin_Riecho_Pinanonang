package casestudy.casestudyoop2

abstract class Category {
    var name:String

    init {
        name = "Default Name"
    }

    abstract fun displayCategory()
}