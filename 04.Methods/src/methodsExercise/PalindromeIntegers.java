package methodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        while (!"End".equalsIgnoreCase(command)) {
            String reverseNum = reverse(command);
            if (command.equals(reverseNum)) {
                System.out.println(true);
            } else {
                System.out.println("false");
            }
            command = scanner.nextLine();
        }
    }

    private static String reverse(String number) {
        StringBuilder reverseNum = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            reverseNum.append(number.charAt(i));
        }
        return reverseNum.toString();
    }
}