package kotlinoop.kotlinoop9inheritance

open class Person {
    private var name:String = "Default name"
    private var age:Int = 0

    fun setName(name:String){
        this.name = name
    }

    fun setAge(age:Int){
        this.age = age
    }

    fun getAge():Int{
        return age
    }

    fun getName():String{
        return name
    }
}