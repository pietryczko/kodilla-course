import java.util.Scanner;

public class SudokuMenu {

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sudoku");
        SudokuBoard sudokuBoard = new SudokuBoard(9, 9);
        System.out.println("Choose row: ");
        int row = scanner.nextInt();
        System.out.println("Choose column: ");
        int column = scanner.nextInt();
        System.out.println("Give value");
        int value = scanner.nextInt();
        sudokuBoard.setField(row, column, value);
        System.out.println(sudokuBoard);
    }

}
