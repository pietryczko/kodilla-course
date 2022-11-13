import java.util.Scanner;

public class SudokuLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Sudoku");
        SudokuBoard sudokuBoard = new SudokuBoard(9, 9);
        System.out.println(sudokuBoard);
        while (true) {
            System.out.println("Choose row: ");
            int row = scanner.nextInt() - 1;
            System.out.println("Choose column: ");
            int column = scanner.nextInt() - 1;
            System.out.println("Give value");
            int value = scanner.nextInt();
            sudokuBoard.setField(row, column, value);
            System.out.println(sudokuBoard);
        }
    }
}
