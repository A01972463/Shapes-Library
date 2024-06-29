import org.example.Point
import org.example.Line
import kotlin.test.Test
import kotlin.test.assertEquals

class LineTest {
    var PointA = Point(0.0, 0.0)
    var PointB = Point(2.0, 3.5)
    var Line = Line(PointA, PointB)

    @Test
    fun testLineConstruction() {
        assertEquals(0.0, Line.pointA.x)
        assertEquals(0.0, Line.pointA.y)
        assertEquals(2.0, Line.pointB.x)
        assertEquals(3.5, Line.pointB.x)
    }

    @Test
    fun testLineGetSlope() {

    }

    @Test
    fun testLineGetLength() {

    }

    @Test
    fun testMoveLine() {

    }
}