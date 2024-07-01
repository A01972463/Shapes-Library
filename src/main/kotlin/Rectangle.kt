package org.example

open class Rectangle(var pointA: Point, var pointB: Point) {
    fun getPoints(): Any {
        val x1 = pointA.x
        val x2 = pointB.x
        val y1 = pointA.y
        val y2 = pointB.y

        return listOf(pointA, Point(x2, y1), pointB, Point(x1, y2))
    }

    fun getArea(): String {
        val x1 = pointA.x
        val x2 = pointB.x
        val y1 = pointA.y
        val y2 = pointB.y

        val sum1 = (x2 - x1) * (x2 - x1)
        val root1 = Math.sqrt(sum1)

        val sum2 = (y2 - y1) * (y2 - y1)
        val root2 = Math.sqrt(sum2)

        return String.format("%.3f", root1 * root2)
    }

    fun moveRectangle(newPointA: Point, newPointB: Point) {
        pointA = newPointA
        pointB = newPointB
    }
}