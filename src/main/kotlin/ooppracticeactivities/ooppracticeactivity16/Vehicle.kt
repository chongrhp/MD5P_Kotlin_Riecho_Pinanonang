package ooppracticeactivities.ooppracticeactivity16
abstract class Vehicle {
    private var brand: String
    private var year: Int

    init{
        brand = ""
        year = 0
    }
    abstract fun start()
    abstract fun stop()

    internal fun setBrand(brand:String){
        this.brand = brand
    }

    internal fun setYear(year:Int){
        this.year = year
    }

    internal fun getBrand():String{
        return this.brand
    }

    internal fun getYear():Int{
        return this.year
    }
    fun accelerate(){
        println("Accelerate vehicle")
    }

}