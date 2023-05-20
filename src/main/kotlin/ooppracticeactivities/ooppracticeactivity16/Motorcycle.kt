package ooppracticeactivities.ooppracticeactivity16
class Motorcycle:Vehicle() {
    override fun start(){
        println("Start motorcycle")
    }
    override fun stop(){
        println("Stop motorcycle")
    }


    fun updateBrand(brand:String){
        setBrand(brand)
    }

    fun updateYear(year:Int){
        setYear(year)
    }


    fun displayDetails(){
        println("Brand name: ${this.getBrand()}")
        println("Model year: ${this.getYear()}")
    }
}