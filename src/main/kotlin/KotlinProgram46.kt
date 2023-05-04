fun main() {
    //assertion
    //nullable - non-nullable
    var name:String? = "John"
    var newName = name!!

    //println(newName)

    //elvis operator
    var name2:String? = null
    var elvisOperatorResult = name2?:"No null values please"
                            //display name2 if not null, otherwise display "No null values please
    println(elvisOperatorResult)

    //?let
    var greeting:String? = "Hello"
    var result = greeting?.let{10+10}
                //display let{} if not null, otherwise null
    println(result)
}