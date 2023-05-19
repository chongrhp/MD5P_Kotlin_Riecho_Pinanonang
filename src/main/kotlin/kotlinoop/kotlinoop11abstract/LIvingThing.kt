package kotlinoop.kotlinoop11abstract

abstract class LIvingThing {
    private var specie: String

    init{
        specie = ""
    }

    fun breath(){
        println("A Living thing breathes")
    }

    abstract fun walk()
}