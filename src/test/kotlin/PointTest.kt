import org.example.Point
import kotlin.test.Test
import kotlin.test.assertEquals

class PointTest {
    val Point = Point(0.0, 0.0)

    @Test
    fun testPointConstruction() {
        assertEquals(0.0, Point.x)
        assertEquals(0.0, Point.y)
    }
    @Test
    fun testMovePoint() {
        Point.movePoint(2.0, 3.5)

        assertEquals(2.0, Point.x)
        assertEquals(3.5, Point.y)
    }
}