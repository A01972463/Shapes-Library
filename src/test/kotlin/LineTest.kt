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
        assertEquals("1.75", Line.getSlope())
    }

    @Test
    fun testLineGetLength() {
        assertEquals("4.031", Line.getLength())
    }

    @Test
    fun testMoveLine() {
//        Move Point
        PointA.movePoint(2.0, 3.5)
        PointB.movePoint(4.0, 6.0)
        Line.moveLine(PointA, PointB)

        assertEquals(2.0, Line.pointA.x)
        assertEquals(3.5, Line.pointA.y)
        assertEquals(4.0, Line.pointB.x)
        assertEquals(6.0, Line.pointB.x)

//        New Point
        val newPointA = Point(-2.0, -3.5)
        val newPointB = Point(-4.0, -6.0)
        Line.moveLine(newPoint)

        assertEquals(-2.0, Line.pointA.x)
        assertEquals(-3.5, Line.pointA.y)
        assertEquals(-4.0, Line.pointB.x)
        assertEquals(-6.0, Line.pointB.x)

//        Direct Point
        Line.moveLine(Point(0.0, 0.0), Point(2.0, 3.5))

        assertEquals(0.0, Line.pointA.x)
        assertEquals(0.0, Line.pointA.y)
        assertEquals(2.0, Line.pointB.x)
        assertEquals(3.5, Line.pointB.x)
    }
}