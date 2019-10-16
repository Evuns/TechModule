package DataTypesVariablesExercise;

import java.util.Scanner;

public class PrintASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginning = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = beginning; i <= end ; i++) {
            System.out.printf("%c ", i);

        }

    }
}
