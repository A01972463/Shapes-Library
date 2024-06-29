import org.example.Ellipse
import org.example.Point
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

    }

    @Test
    fun testMoveEllipse() {

    }
}