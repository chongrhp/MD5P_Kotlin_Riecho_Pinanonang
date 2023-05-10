package ooppracticeactivities.ooppracticeactivity2_rectangle

class Rectangle(val length:Int, val width:Int) {
    var area:Int = 0
    fun getArea(){
        this.area = length * width
        println("Rectangle area is: ${this.area}")
    }
}