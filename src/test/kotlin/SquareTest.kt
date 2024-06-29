import org.example.Point
import org.example.Square
import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest {
    var PointA = Point(0.0, 0.0)
    var Square = Square(PointA, 5.0)

    @Test
    fun testSquareConstruction() {
        assertEquals(0.0, Square.pointA.x)
        assertEquals(0.0, Square.pointA.y)
        assertEquals(5.0, Square.pointB.x)
        assertEquals(5.0, Square.pointB.x)
        assertEquals(5.0, Square.sideLength)
    }

    @Test
    fun testSquareGetPoints() {

    }

    @Test
    fun testSquareGetArea() {

    }

    @Test
    fun testMoveSquare() {

    }
}