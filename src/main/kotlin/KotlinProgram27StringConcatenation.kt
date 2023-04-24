fun main(){
    //01234
    //Hello

    //concatenation
    val firstName = "Juan"
    val middleName = "D."
    val lastName = "Dela Cruz"
    var fullName = firstName + " " + middleName + " " + lastName
    fullName = firstName.plus(" ").plus(middleName).plus(" ").plus(lastName)
    println(fullName)

    //interpolation
    fullName = "$firstName $middleName $lastName"
    println(fullName)

    //substring
    var myText = "Hello World!"
    var subText = myText.substring(6,12)
    println(subText)

    //Splitting
    var text = "peter,paul,mary"
    var splitText = text.split(",")
    println(splitText)
    //println(splitText[1])

    //trim
    var textToTrim = " \n Hello World!   "
    var trimmedText = textToTrim.trim()
    println(trimmedText)
}