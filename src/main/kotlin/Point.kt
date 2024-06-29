package org.example

class Point
    (var x: Double,
    var y: Double) {

    fun movePoint(newX: Double, newY: Double) {
        x = newX
        y = newY
    }
}