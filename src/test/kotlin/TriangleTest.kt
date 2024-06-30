import org.example.Point
import org.example.Triangle
import kotlin.test.Test
import kotlin.test.assertEquals

class TriangleTest {
    var PointA = Point(0.0, 0.0)
    var PointB = Point(1.0, 1.0)
    var PointC = Point(0.0, 2.0)
    var Triangle = Triangle(PointA, PointB, PointC)
    @Test
    fun testTriangleConstruction() {
        assertEquals(0.0, Triangle.pointA.x)
        assertEquals(0.0, Triangle.pointA.y)
        assertEquals(1.0, Triangle.pointB.x)
        assertEquals(1.0, Triangle.pointB.x)
        assertEquals(0.0, Triangle.pointC.x)
        assertEquals(2.0, Triangle.pointC.y)
    }

    @Test
    fun testTriangleGetArea() {
        assertEquals(1, Triangle.getArea())
    }

    @Test
    fun testMoveTraingle() {
//        Move Point
        PointA.movePoint(-1.0, -1.0)
        PointB.movePoint(0.0, 2.0)
        PointC.movePoint(1.0, -1.0)
        Triangle = Triangle(PointA, PointB, PointC)

        assertEquals(-1.0, Triangle.pointA.x)
        assertEquals(-1.0, Triangle.pointA.y)
        assertEquals(0.0, Triangle.pointB.x)
        assertEquals(2.0, Triangle.pointB.x)
        assertEquals(1.0, Triangle.pointC.x)
        assertEquals(-1.0, Triangle.pointC.y)

//        New Point
        val newPointA = Point(0.0, 0.0)
        val newPointB = Point(1.0, 1.0)
        val newPointC = Point(0.0, 2.0)
        Ellipse.moveEllipse(newPointA, newPointB, newPointC)

        assertEquals(0.0, Triangle.pointA.x)
        assertEquals(0.0, Triangle.pointA.y)
        assertEquals(1.0, Triangle.pointB.x)
        assertEquals(1.0, Triangle.pointB.x)
        assertEquals(0.0, Triangle.pointC.x)
        assertEquals(2.0, Triangle.pointC.y)

//        Direct Point
        Ellipse.moveEllipse(Point(-1.0, -1.0), Point(0.0, 2.0), Point(1.0, -1.0))

        assertEquals(-1.0, Triangle.pointA.x)
        assertEquals(-1.0, Triangle.pointA.y)
        assertEquals(0.0, Triangle.pointB.x)
        assertEquals(2.0, Triangle.pointB.x)
        assertEquals(1.0, Triangle.pointC.x)
        assertEquals(-1.0, Triangle.pointC.y)
    }
}