package ooppracticeactivities.ooppracticeactivity16

class Car : Vehicle() {

    override fun start(){
        println("Start Car")
    }
    override fun stop(){
        println("Stop Car")
    }

    fun updateBrand(brand:String){
        setBrand(brand)
    }

    fun updateYear(year:Int){
        setYear(year)
    }

    fun pullBrand():String{
        return this.getBrand()
    }

    fun pullYear():Int{
        return this.getYear()
    }

    fun displayDetails(){
        println("Brand name: ${this.getBrand()}")
        println("Model year: ${this.getYear()}")
    }

}