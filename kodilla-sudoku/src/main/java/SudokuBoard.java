import java.util.ArrayList;
import java.util.Set;

public class SudokuBoard {
ArrayList<SudokuRow> gameBoard;

    public void createBoard(int rowNumber) {
        for (int i = 0; i < 9; i++) {
            gameBoard.add(new SudokuRow().createRow(i));
        }
    }
}
