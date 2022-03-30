class ChessBoard {
    val cells: List<Cell> = createDashboard()
    private fun createDashboard(): List<Cell> =
        (1..8).flatMap { x -> (1..8).map { y -> Cell(x, y) } }

    fun numberOfCells(): Int = cells.count()
    fun countRows(): Int {
        return cells
            .map { cell -> cell.x }
            .distinct()
            .count()
    }
}

data class Cell(val x: Int, val y: Int)
