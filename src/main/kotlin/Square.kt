package org.example

class Square(var Point: Point, var sideLength: Double) {
    fun getPoints(): List<Pair<Double, Double>>  {
        val x1 = Point.x
        val y1 = Point.y

        return listOf(Pair(x1, y1), Pair(x1 + sideLength, y1), Pair(x1 + sideLength, y1 - sideLength), Pair(x1, y1 - sideLength))
    }

    fun getArea(): String {
        return String.format("%.3f", sideLength * sideLength)
    }

    fun moveSquare(newPoint: Point, newSideLength: Double) {
        Point = newPoint
        sideLength = newSideLength
    }
}