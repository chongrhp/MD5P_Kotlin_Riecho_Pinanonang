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

fun showMenuOption(){
    println("**** OPTION ****")
    println("a. Add item")
    println("b. List items")
    println("c. Exit")
    print("Select option: ")
}

fun itemAdd():MutableList<Any>{
    var item = mutableListOf<Any>()
    var barCode:String = ""
    var itemName:String = ""
    var itemCost:Double = 0.0
    var itemQty:Int = 0

    println()
    while(true){
        try{
            print("Enter barcode: ")
            barCode = readln()
            print("item name: ")
            itemName = readln()
            print("Quantity:")
            itemQty = readln().toInt()
            print("item cost: ")
            itemCost = readln().toDouble()
            break
        } catch (e:Exception){
            println("Error message: ${e.message}")
        }
    }

    item.add(barCode)
    item.add(itemName)
    item.add(itemQty)
    item.add(itemCost)
    return item
}

fun itemList(list:MutableList<List<Any>>){
    var totalAmount = 0.0
    var totalCost = 0.0

    println("-------------------------------------")
    println("barcode\tname\tqty.\tcost\ttotal")
    println("-------------------------------------")
    for(a in 0.. (list.size-1)){
        for(b in 0..(list[a].size-1)){
            print("${list[a][b]}\t")
        }
        totalCost = list[a][2].toString().toDouble() * list[a][3].toString().toDouble()
        totalAmount += totalCost
        println(String.format("%,.2f",totalCost))

    }
    println("-------------------------------------")
    println("Total Amount:\t\t   ${String.format("%,.2f",totalAmount)}")
}

