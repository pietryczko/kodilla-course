import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    final public static int EMPTY = -1;
    private final ArrayList<Integer> possibleNumbers = new ArrayList<>();
    private int value = EMPTY;

    public SudokuElement(int x) {
        addPossibleNumbers(x);
    }

    private void addPossibleNumbers(int x) {
        for (int i = 0; i < x; i++) {
            possibleNumbers.add(i+1);
        }
    }

    public void removePossibleNumber(int value) {
        possibleNumbers.remove(Integer.valueOf(value));
    }

    public void setValue(int value) {
        System.out.println(possibleNumbers);
        if (possibleNumbers.contains(value)) {
            this.value = value;
        } else {
            System.out.println("no");
        }
    }

    @Override
    public String toString() {
        String sudokuElement = String.valueOf(value);
        if (value == -1) {
            sudokuElement = " ";
        }
        return sudokuElement;
    }
}
