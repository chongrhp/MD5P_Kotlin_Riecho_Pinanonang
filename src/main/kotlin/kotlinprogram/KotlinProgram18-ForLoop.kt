package kotlinprogram

fun main(){
    //while loop
    for(counter in 1..10) { //5..10
        if(counter == 7) {
            continue
        }
        println(counter)

    }
    println("Hello World!")
}