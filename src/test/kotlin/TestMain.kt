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

}