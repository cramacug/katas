import org.junit.jupiter.api.Test
import kotlin.test.junit5.JUnit5Asserter.assertEquals

internal class TestMain {

    @Test
    fun `create a chess board with 8x8 cells`() {
        // Given
        val chessboard = ChessBoard()

        // When
        val numberOfCells: Int = chessboard.numberOfCells()

        // Then
        assertEquals("A chessboard must have 64 cells", 64, numberOfCells)
    }

    @Test
    fun `a chess must have 8 rows of 8 cells`() {

        // Given
        val chessBoard = ChessBoard()

        // When
        val numberOfRows: Int = chessBoard.countRows()

        // Then
        assertEquals("A chessboard must have 8 rows", 8, numberOfRows)
    }
}