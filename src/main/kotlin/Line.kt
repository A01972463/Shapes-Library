package org.example

class Line(var pointA: Point,
          var pointB: Point) {

    fun getSlope(): String {
        val rise = pointB.y - pointA.y
        val run = pointB.x - pointA.x

        return String.format("%.3f", rise.div(run))
    }

    fun getLength(): String {
        val x = pointB.y - pointA.y
        val y = pointB.x - pointA.x

        val sum = (x * x) + (y * y)

        return String.format("%.3f", Math.sqrt(sum))
    }

    fun moveLine(newPointA: Point, newPointB: Point) {
        pointA = newPointA
        pointB = newPointB
    }
}