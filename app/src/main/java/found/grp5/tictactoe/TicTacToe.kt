package found.grp5.tictactoe

data class Win(val name: Char?, val co_ords: Array<Pair<Int, Int>>)

class TicTacToe {
    fun winner(board: Array<CharArray>): Win {

        // check rows
        for ((i, row) in board.withIndex()) {
            if (!row.contains('\u0000') && row.all { it == row[0]}) {
                return Win(row[0], arrayOf(Pair(i, 0), Pair(i, 1), Pair(i, 2)))
            }
        }

        // Check columns
        for (i in 0 .. 2) {
            if (board[0][i] == '\u0000' || board[1][i] == '\u0000' || board[2][i] == '\u0000') {
                continue
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return Win(board[0][i], arrayOf(Pair(0, i), Pair(1, i), Pair(2, i)))
            }
        }

        // Check diagonals
        if (board[0][0] != '\u0000' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return  Win(board[0][0], arrayOf(Pair(0, 0), Pair(1, 1), Pair(2, 2)))
        }
        if (board[0][2] != '\u0000' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return  Win(board[0][2], arrayOf(Pair(0, 2), Pair(1, 1), Pair(2, 0)))
        }

        return  Win(null, arrayOf(Pair(0, 0), Pair(0, 1), Pair(1, 1)))
    }

    fun draw(board: Array<CharArray>): Boolean {
        for (row in board) {
            if (row.contains('\u0000')) {
                return false
            }
        }
        return true
    }
}