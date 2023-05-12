package kotlinoop.kotlinoop6inner

class Outer {
    val outerClassName = "Outer name"

    inner class Inner{
        fun callOuter(){
            println(outerClassName)
        }
    }
}