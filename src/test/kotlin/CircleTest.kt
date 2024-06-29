import org.example.Circle
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class CircleTest {
    var Point = Point(0.0, 0.0)
    val Circle = Circle(Point, 5.0)

    @Test
    fun testCircleConstruction() {
        assertEquals(0.0, Circle.point.x)
        assertEquals(0.0, Circle.point.y)
        assertEquals(5.0, Circle.radius)
    }

    @Test
    fun testCircleGetArea() {
        assertEquals("78.54", Circle.getArea())
    }

    @Test
    fun testMoveCircle() {
        Point.movePoint(2.0, 3.5)
        Circle.moveCircle(Point(2.0, 3.5), 7.0)

        assertEquals(2.0, Circle.point.x)
        assertEquals(3.5, Circle.point.y)
        assertEquals(7.0, Circle.radius)

        val newPoint = Point(-2.0, -3.5)
        Circle.moveCircle(newPoint, 10.0)

        assertEquals(-2.0, Circle.point.x)
        assertEquals(-3.5, Circle.point.y)
        assertEquals(10.0, Circle.radius)
    }
}