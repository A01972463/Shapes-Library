import org.example.Circle
import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class CircleTest {
    val Point = Point(0.0, 0.0)
    val Circle = Circle(Point, 5.0)

    @Test
    fun testCircleConstruction() {
        assertEquals(Point(0.0, 0.0), Circle.point)
        assertEquals(5.0, Circle.radius)
    }

    @Test
    fun testCircleGetArea() {
        assertEquals(Circle.getArea(), 78.54)
    }

    @Test
    fun testMoveCircle() {
        Circle.moveCircle(Point(2.0, 3.5), 7.0)

        assertEquals(Point(2.0, 3.5), Circle.point)
        assertEquals(7.0, Circle.radius)
    }
}