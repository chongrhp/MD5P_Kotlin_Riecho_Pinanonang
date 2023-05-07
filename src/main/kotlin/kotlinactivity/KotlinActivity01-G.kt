fun main(){
    print("Enter string: ")
    var myString = readln()

    if(myString == palindrome(myString)) {
        println("$myString - Palindrome")
    } else {
        println("$myString - Not palindrome")
    }

}

fun palindrome(str1:String):String{
    var isPalindrome:String = ""
    var strSize:Int = str1.length
    var i = 0

    for(i in 0..strSize-1){
        isPalindrome = isPalindrome.plus(str1[strSize-(1+i)])
    }
    return isPalindrome
}