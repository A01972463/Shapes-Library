package org.example

class Circle
    (var point: Point,
     var radius: Double) {

    fun getArea(): String {
        val area = Math.PI * radius * radius

        return String.format("%.2f", area)
    }

    fun moveCircle(newPoint: Point, newRadius: Double) {
        this.point = newPoint
        this.radius = newRadius
    }
}