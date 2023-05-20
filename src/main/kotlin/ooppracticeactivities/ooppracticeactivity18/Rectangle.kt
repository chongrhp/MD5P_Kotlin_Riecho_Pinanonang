package ooppracticeactivities.ooppracticeactivity18

class Rectangle(val length:Double, val width:Double): Shape {

    override fun calculateArea():Double {
        return length * width
    }
}