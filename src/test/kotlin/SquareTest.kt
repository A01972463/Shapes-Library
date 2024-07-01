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
        val points = listOf(Square.getPoints())

        assertEquals(0.0, points[0].x)
        assertEquals(0.0, points[0].y)
        assertEquals(5.0, points[1].x)
        assertEquals(0.0, points[1].y)
        assertEquals(5.0, points[2].x)
        assertEquals(-5.0, points[2].y)
        assertEquals(0.0, points[3].x)
        assertEquals(-5.0, points[3].y)
    }

    @Test
    fun testSquareGetArea() {
        assertEquals("25.00", Square.getArea())
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