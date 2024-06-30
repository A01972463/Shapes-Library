package org.example

class Ellipse(var point: Point,
              var height: Double,
              var width: Double) {

    fun getArea(): String {
        val area = Math.PI * height * width

        return String.format("%.2f", area)
    }

    fun moveEllipse(newPoint: Point,
                    newHeight: Double,
                    newWidth: Double) {
        point = newPoint
        height = newHeight
        width = newWidth
    }
}