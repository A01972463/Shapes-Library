import org.example.Point
import org.example.Ellipse
import kotlin.test.Test
import kotlin.test.assertEquals

class EllipseTest {
    var Point = Point(0.0, 0.0)
    val Ellipse = Ellipse(Point, 5.0, 7.0)

    @Test
    fun testEllipseConstruction() {
        assertEquals(0.0, Ellipse.point.x)
        assertEquals(0.0, Ellipse.point.y)
        assertEquals(5.0, Ellipse.height)
        assertEquals(7.0, Ellipse.width)
    }

    @Test
    fun testEllipseGetArea() {
        assertEquals("109.96", Ellipse.getArea)
    }

    @Test
    fun testMoveEllipse() {
//        Move Point
        Point.movePoint(2.0, 3.5)
        Ellipse.moveEllipse(Point, 7.0, 10.0)

        assertEquals(0.0, Ellipse.point.x)
        assertEquals(0.0, Ellipse.point.y)
        assertEquals(7.0, Ellipse.height)
        assertEquals(10.0, Ellipse.width)

//        New Point
        val newPoint = Point(-2.0, -3.5)
        Ellipse.moveEllipse(newPoint, 10.0, 15.0)

        assertEquals(-2.0, Ellipse.point.x)
        assertEquals(-3.5.0, Ellipse.point.y)
        assertEquals(10.0, Ellipse.height)
        assertEquals(15.0, Ellipse.width)

//        Direct Point
        Ellipse.moveEllipse(Point(0.0, 0.0), 5.0 , 7.0)

        assertEquals(0.0, Ellipse.point.x)
        assertEquals(0.0, Ellipse.point.y)
        assertEquals(5.0, Ellipse.height)
        assertEquals(7.0, Ellipse.width)
    }
}