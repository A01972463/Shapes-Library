import org.example.Point
import org.example.Square
import kotlin.test.Test
import kotlin.test.assertEquals

class SquareTest {
    var Point = Point(0.0, 0.0)
    var Square = Square(Point, 5.0)

    @Test
    fun testSquareConstruction() {
        assertEquals(0.0, Square.Point.x)
        assertEquals(0.0, Square.Point.y)
        assertEquals(5.0, Square.sideLength)
    }

    @Test
    fun testSquareGetPoints() {
        val points = Square.getPoints()

        assertEquals(Pair(0.0, 0.0), points[0])
        assertEquals(Pair(5.0, 0.0), points[1])
        assertEquals(Pair(5.0, -5.0), points[2])
        assertEquals(Pair(0.0, -5.0), points[3])
    }

    @Test
    fun testSquareGetArea() {
        assertEquals("25.000", Square.getArea())
    }

    @Test
    fun testMoveSquare() {
//        Move Point
        Point.movePoint(-1.0, -1.0)
        Square.moveSquare(Point, 2.0)

        assertEquals(-1.0, Square.Point.x)
        assertEquals(-1.0, Square.Point.y)

//        New Point
        val newPoint = Point(0.0, 0.0)
        Square.moveSquare(newPoint, 5.0)

        assertEquals(0.0, Square.Point.x)
        assertEquals(0.0, Square.Point.y)

//        Direct Point
        Square.moveSquare(Point(-1.0, -1.0), 2.0)

        assertEquals(-1.0, Square.Point.x)
        assertEquals(-1.0, Square.Point.y)
    }
}