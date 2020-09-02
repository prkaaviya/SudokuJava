package sudoku.problemDomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] gridState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GamesState gamesState, int[][] gridState) {
        this.gameState = gamesState;
        this.gridState = gridState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
    }

    public GameState getGameState() {
         return gameState;
    }
}
