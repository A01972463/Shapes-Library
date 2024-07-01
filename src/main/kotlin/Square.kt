package org.example

class Square(var Point: Point, var sideLength: Double) {
    fun getPoints(): Any {
        val x1 = Point.x
        val y1 = Point.y

        return listOf(Point, Point(x1 + sideLength, y1), Point(x1 + sideLength, y1 + sideLength), Point(x1, y1 + sideLength))
    }

    fun getArea(): String {
        return String.format("%.3f", sideLength * sideLength)
    }

    fun moveSquare(newPoint: Point, newSideLength: Double) {
        Point = newPoint
        sideLength = newSideLength
    }
}