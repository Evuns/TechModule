package arrayMoreExercise;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[] previousArrayRow = new int[0];
        for (int row = 1; row <= rows; row++) {
            int[] arrayRow = new int[row];
            if (row == 1) {
                arrayRow[0] = 1;
            } else {
                for (int i = 0; i < row; i++) {
                    if (i == 0) {
                        arrayRow[i] = previousArrayRow[i];
                    } else if (i == row - 1) {
                        arrayRow [i] = 1;
                    } else {
                        arrayRow[i] = previousArrayRow[i] + previousArrayRow[i - 1];
                    }
                }
            }
            for (int value : arrayRow) {
                System.out.print(value + " ");
            }
            previousArrayRow = arrayRow;
            System.out.println();
        }

    }
}
