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
        assertEquals(-3.5, Rectangle.pointB.x)
    }

    @Test
    fun testRectangleGetPoints() {

    }

    @Test
    fun testRectangleGetArea() {

    }

    @Test
    fun testMoveRectangle() {

    }
}