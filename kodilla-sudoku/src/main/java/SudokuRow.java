import java.util.ArrayList;

public class SudokuRow {
    ArrayList<SudokuElement> sudokuRow = new ArrayList<>();

    public SudokuRow createRow(int rowNumber) {
        for (int i = 0; i < 9; i++) {
            sudokuRow.add(new SudokuElement(SudokuElement.EMPTY, rowNumber, i));
        }
        return this;
    }
}
