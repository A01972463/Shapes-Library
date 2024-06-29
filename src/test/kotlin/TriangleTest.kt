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

    }

    @Test
    fun testMoveTraingle() {

    }
}