class ChessBoard {
    val cells: List<Cell> = createDashboard()
    private fun createDashboard(): List<Cell> {
        return (1..64).map { i -> Cell(i, i) }
    }

    fun numberOfCells(): Int = cells.count()
}

data class Cell(val x: Int, val y: Int)
