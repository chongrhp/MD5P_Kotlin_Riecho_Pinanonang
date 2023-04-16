fun main(){
    //Initialize variable
    var fare:Int = 0
    var fareCode:Char = 'A'
    var inBusinessType:Char = 'N'
    var addFare:Int = 0
    var discount:Double = 0.0
    var totalFare:Double = 0.0

    //Input variables
    print("Enter fare: ")
    fare = readln().toInt()
    print("Passenger type[O,S,C]: ")
    fareCode = readln()!!.first()
    print("Travelling in business class[Y,N]:")
    inBusinessType = readln()!!.first()

    //check type of passenger to avail discounted on fare
    // if belong to student or Senior citizen
    when (fareCode){
        'S' -> {discount = fare * 0.05}
        'C' -> {discount = fare * 0.10}
        else -> {discount = 0.0}
    }
    println("Discount fare is ${String.format("%,.2f",discount)}")

    //check argument and display additional business class travel fare
    if(inBusinessType == 'Y' || inBusinessType == 'y'){
        when (fareCode){
            'O' -> {addFare = 1000}
            'S' -> {addFare = 700}
            'C' -> {addFare = 500}
        }
        println("Business class charge is $addFare")
    }

    //get the total fare including discount and additional fare
    totalFare = (fare - discount) + addFare.toDouble()

    //Display output
    println("New fare is ${String.format("%,.2f",totalFare)}")

}
