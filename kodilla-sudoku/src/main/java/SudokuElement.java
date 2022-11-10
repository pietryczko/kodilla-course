import java.util.List;

public class SudokuElement {
    final public static int EMPTY = -1;
    private List<Integer> possibleNumbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    private int value;
    private int x;
    private int y;

    public SudokuElement(int value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }
}
