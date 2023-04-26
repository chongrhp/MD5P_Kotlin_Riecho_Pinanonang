fun main(){

    //Input string value
    print("\nEnter string: ")
    val statement = readln()
    val vowels = setOf('a','e','i','o','u','A','E','I','O','U')
    var countVowels:Int = 0

    for (char in statement){
            if(char in vowels){
            countVowels++
        }
    }

    //display output counted vowels
    println("total vowels: $countVowels")
}