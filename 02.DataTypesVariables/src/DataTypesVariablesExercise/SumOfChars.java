package DataTypesVariablesExercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLines = Integer.parseInt(scanner.nextLine());
        int sumChar = 0;

        for (int i = 0; i < numberLines; i++) {
            char letters = scanner.nextLine().charAt(0);
            sumChar += letters;
        }
        System.out.println("The sum equals: " + sumChar);
    }
}
