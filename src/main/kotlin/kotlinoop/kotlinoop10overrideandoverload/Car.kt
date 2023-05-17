package kotlinoop.kotlinoop10overrideandoverload

class Car(brand:String, model:String,year:Int) :
        Vehicle(brand,model,year) {
        fun refuel(){
                println("Refuelling...")
        }
        //Polymorphism Many forms
        //function overriding
        override fun accelerate(){
                super.accelerate()
                println("A CAR accelerates!!")
        }

        //function overloading
        fun accelerate(speed:Double){
                println("acceleration speed is $speed")
        }


}