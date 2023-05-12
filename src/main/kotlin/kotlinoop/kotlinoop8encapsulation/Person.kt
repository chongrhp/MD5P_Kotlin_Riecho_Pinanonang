package kotlinoop.kotlinoop8encapsulation

//encapsulation/information hiding values
//object variables/member variables are not
// access directly but it can be accessed via
//setter and getter function
//access modifier - public and private

class Person {
    private var name:String = "no name"
    private var age:Int = 0

    fun sayHello(){
        println("$name say hello!")
    }

    fun getName():String{
        return name
    }

    fun setName(name:String){
        this.name = name

    }

    fun getAge():Int{
        return age
    }

    fun setAge(age:Int){
        if(age > 0){
            this.age = age
        } else {
            println("invalid age value")
        }
    }
}