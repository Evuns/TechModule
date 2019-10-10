package DataTypesVariablesLab;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String length = Integer.toString(i);
            int currentNumber = i;
            int digitSum = 0;
            for (int j = length.length() - 1; j >= 0; j--) {
                int lastDigit = currentNumber % 10;
                digitSum += lastDigit;
                currentNumber = (currentNumber - lastDigit) / 10;
            }
            if (digitSum == 5 || digitSum  == 7 || digitSum == 11) {
                System.out.println(i + " -> True");
            } else {
                System.out.println(i + " -> False");
            }

        }
    }
}
