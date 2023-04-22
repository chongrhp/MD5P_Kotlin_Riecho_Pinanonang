fun main(){
    //arralylist
    var names = ArrayList<String>()
    print("Enter name 1:")
    names.add(readln())
    print("Enter name 2:")
    names.add(readln())
    print("Enter name 3:")
    names.add(readln())

    var ctr:Int = 0
    while(ctr < names.size){
        println(names[ctr])
        ctr++
    }
}