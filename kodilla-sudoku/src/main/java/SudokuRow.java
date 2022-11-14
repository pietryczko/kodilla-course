import java.util.ArrayList;

public class SudokuRow {
    private final ArrayList<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow(int x) {
        createRow(x);
    }

    private void createRow(int x) {
        for (int i = 0; i < x; i++) {
            sudokuElements.add(new SudokuElement(x));
        }
    }

    public ArrayList<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }
}
