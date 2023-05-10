import kotlinprogram.total
fun main(){
    var items = mutableListOf<List<Any>>()
    var username:String = "cashier"
    var userpass:String = "cashier"
    var isLoggin:Boolean = false

    while (!isLoggin){
        print("Enter user name: ")
        var logusername = readln()
        print("Enter password: ")
        var loguserpass = readln()

        if(logusername == username && loguserpass == userpass) {
            isLoggin = true
        } else {
            println("Wrong user name and password...")
        }
        if (logusername == "exit") break
    }

    if(isLoggin){
        var option:Char = 'i'
        do{
            println()
            showMenuOption() //Display option
            option = readln().first() //Read option

            when(option){
                'a' -> items.add(itemAdd())
                'b' -> itemList(items)
            }
        }while(option != 'c')
    }
}
