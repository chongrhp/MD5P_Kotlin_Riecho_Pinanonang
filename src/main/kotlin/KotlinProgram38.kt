fun main(){
    try {
        println("hello")
        throw Exception()
        println("Hi")
    }catch(e:Exception){
        println("This is an exception!")
    }
}