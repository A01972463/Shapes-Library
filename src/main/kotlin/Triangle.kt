package org.example

class Triangle(var pointA: Point,
               var pointB: Point,
               var pointC: Point) {

    fun getArea(): String {
        val vertex1 = pointA.x * (pointB.y - pointC.y)
        val vertex2 = pointB.x * (pointC.y - pointA.y)
        val vertex3 = pointC.x * (pointA.y - pointB.y)
        val area = Math.abs(vertex1 + vertex2 +vertex3)

        return String.format("%.3f", area/2)
    }

    fun moveTriangle(newPointA: Point,
                     newPointB: Point,
                     newPointC: Point) {
        pointA = newPointA
        pointB = newPointB
        pointC = newPointC
    }
}