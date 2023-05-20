package kotlinoop.kotlinoop13interface

class Person: Singer, Dancer, Performer() {
    private var name : String

    init{
        name = "Default Name"
    }

    fun setName(name: String){
        this.name = name
    }

    fun getName(): String {
        return name
    }

    override fun sing(){
        println("A person sings...")
    }

    override fun dance(){
        println("A person dances...")
    }

    override fun performer(){
        println("a person can perform")
    }
}