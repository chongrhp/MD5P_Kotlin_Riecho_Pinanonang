package ooppracticeactivities.ooppracticeactivity18

class Circle(val radius:Double): Shape {
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }
}