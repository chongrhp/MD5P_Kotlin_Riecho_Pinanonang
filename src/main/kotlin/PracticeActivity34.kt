fun main(){

    //Input string value
    print("\nEnter string: ")
    val vowels = readln()

    //declare variables
    var ctr:Int = 0
    var countVowels:Int = 0

    //process vowels counter
    while (ctr < vowels.length){
        if (vowels[ctr] == 'a' || vowels[ctr] == 'e' || vowels[ctr] == 'i' || vowels[ctr] == 'o' || vowels[ctr] == 'u'){
            countVowels++
        }

        ctr++ //update
    }

    //display output counted vowels
    println("total vowels: $countVowels")
}