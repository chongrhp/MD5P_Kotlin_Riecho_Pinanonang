package kotlinoop.kotlinoop7nested

class Outer {
    //Nested class
    //In a nested class, the Inner class cannot
    // access the properties and behaviors of the
    // Outer class
    val outerClassName = "Outer name"

    class Inner{
        fun callOuter(){
            println("Not possible")
        }
    }
}