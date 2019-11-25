package methodsExercise;

import java.util.Scanner;

public class CharactersRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        characters(first, second);

    }

    private static void characters(char start, char end) {

        for (int i = start + 1; i < end; i++) {
            char result = (char) i;
            System.out.print(result + " ");

        }
        if (end < start) {
            for (int i = end + 1; i < start; i++) {
                char result = (char) i;
                System.out.print(result + " ");
            }

        }
    }
}

