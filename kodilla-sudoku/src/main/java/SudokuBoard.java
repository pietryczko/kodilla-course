import java.util.ArrayList;

public class SudokuBoard {
    private ArrayList<SudokuRow> gameBoard = new ArrayList<>();

    public SudokuBoard(int x, int y) {
        createBoard(x, y);
    }

    private void createBoard(int x, int y) {
        for (int i = 0; i < y; i++) {
            gameBoard.add(new SudokuRow(x));
        }
    }

    public void setField(int y, int x, int value) {
        gameBoard.get(y).getSudokuElements().get(x).setValue(value);
        removeNumberFromRow(y, x, value);
        removeNumberFromColumn(y, x, value);
        removeNumberFromBox(y, x, value);

    }

    private void removeNumberFromRow(int y, int x, int value) {
        for (int j = 0; j < gameBoard.get(y).getSudokuElements().size(); j++) {
            gameBoard.get(y).getSudokuElements().get(j).removePossibleNumber(value);
        }
    }

    private void removeNumberFromColumn(int y, int x, int value) {
        for (int i = 0; i < gameBoard.size(); i++) {
            gameBoard.get(i).getSudokuElements().get(x).removePossibleNumber(value);
        }
    }

    private void removeNumberFromBox(int y, int x, int value) {
        int boxRow = x - x % 3;
        int boxColumn = y - y % 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxColumn; j < boxColumn + 3; j++) {
                gameBoard.get(i).getSudokuElements().get(j).removePossibleNumber(value);
            }
        }
    }

    @Override
    public String toString() {
        int y = gameBoard.size();
        String board = "\s" + "--- ".repeat(y) + "\n";
        for (int i = 0; i < y; i++) {
            int x = gameBoard.get(i).getSudokuElements().size();
            for (int j = 0; j < x; j++) {
                board += "| " + gameBoard.get(i).getSudokuElements().get(j) + " ";
            }
            board += "|\n " + "--- ".repeat(y) + "\n";
        }
        return board;
    }
}
