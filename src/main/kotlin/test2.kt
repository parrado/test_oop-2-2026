import kotlin.math.PI

abstract class Shape(private var xCoordinate: Double, private var yCoordinate: Double) {
    abstract fun area(): Double
}

class Square(private var sideLength: Double, xCoordinate: Double, yCoordinate: Double) :
    Shape(xCoordinate, yCoordinate) {
    override fun area(): Double {
        return sideLength * sideLength

    }
}

class Circle(private var radius: Double, xCoordinate: Double, yCoordinate: Double) : Shape(xCoordinate, yCoordinate) {
    override fun area(): Double {
        return  PI * radius * radius
    }
}

fun main() {
    var circle1 = Circle(1.0, 0.0, 0.0)
    var square1 = Square(2.0, -1.0, 1.0)

    println("Area of circle1 is ${circle1.area()}")
    println("Area of square1 is ${square1.area()}")
}