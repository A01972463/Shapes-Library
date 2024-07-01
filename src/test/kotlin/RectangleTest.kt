import org.example.Point
import org.example.Rectangle
import kotlin.test.Test
import kotlin.test.assertEquals

class RectangleTest {
    var PointA = Point(0.0, 0.0)
    var PointB = Point(2.0, -3.5)
    var Rectangle = Rectangle(PointA, PointB)

    @Test
    fun testRectangleConstruction() {
        assertEquals(0.0, Rectangle.pointA.x)
        assertEquals(0.0, Rectangle.pointA.y)
        assertEquals(2.0, Rectangle.pointB.x)
        assertEquals(-3.5, Rectangle.pointB.y)
    }

    @Test
    fun testRectangleGetPoints() {
        val points = Rectangle.getPoints()

        assertEquals(Pair(0.0, 0.0), points[0])
        assertEquals(Pair(2.0, 0.0), points[1])
        assertEquals(Pair(2.0, -3.5), points[2])
        assertEquals(Pair(0.0, -3.5), points[3])
    }

    @Test
    fun testRectangleGetArea() {
        assertEquals("7.000", Rectangle.getArea())
    }

    @Test
    fun testMoveRectangle() {
//        Move Point
        PointA.movePoint(-1.0, -1.0)
        PointB.movePoint(0.0, 2.0)
        Rectangle.moveRectangle(PointA, PointB)

        assertEquals(-1.0, Rectangle.pointA.x)
        assertEquals(-1.0, Rectangle.pointA.y)
        assertEquals(0.0, Rectangle.pointB.x)
        assertEquals(2.0, Rectangle.pointB.y)

//        New Point
        val newPointA = Point(0.0, 0.0)
        val newPointB = Point(1.0, 1.0)
        Rectangle.moveRectangle(newPointA, newPointB)

        assertEquals(0.0, Rectangle.pointA.x)
        assertEquals(0.0, Rectangle.pointA.y)
        assertEquals(1.0, Rectangle.pointB.x)
        assertEquals(1.0, Rectangle.pointB.y)

//        Direct Point
        Rectangle.moveRectangle(Point(-1.0, -1.0), Point(0.0, 2.0))

        assertEquals(-1.0, Rectangle.pointA.x)
        assertEquals(-1.0, Rectangle.pointA.y)
        assertEquals(0.0, Rectangle.pointB.x)
        assertEquals(2.0, Rectangle.pointB.y)
    }
}