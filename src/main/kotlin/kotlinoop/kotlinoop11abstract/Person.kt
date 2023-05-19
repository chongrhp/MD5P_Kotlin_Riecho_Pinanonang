package kotlinoop.kotlinoop11abstract

class Person: LIvingThing() {
    private var name:String

    init{
        name = ""
    }

    fun setName(name:String){
        this.name = name
    }

    fun getName(): String{
        return name
    }

    override fun walk(){
        println("A person walks")
    }
}