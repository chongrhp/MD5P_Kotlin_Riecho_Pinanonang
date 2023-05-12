package kotlinoop.kotlinoop6inner
fun main(){
    val outerObjects = Outer()
    //val innerObject = outerObjects.Inner().callOuter()
    //println(innerObject)
    val innerObject = outerObjects.Inner()
    innerObject.callOuter()
}