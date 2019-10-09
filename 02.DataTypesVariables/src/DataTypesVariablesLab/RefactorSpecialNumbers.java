package DataTypesVariablesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumDigit = 0;
        int currentNumber = 0;
        boolean isSpecial = false;
        for (int digit = 1; digit <= number; digit++) {
            currentNumber = digit;
            while (digit > 0) {
                sumDigit += digit % 10;
                digit = digit / 10;
            }
            isSpecial = (sumDigit == 5) || (sumDigit == 7) || (sumDigit == 11);
            String special = isSpecial + "";
            special = (special.charAt(0) + "").toUpperCase() + special.substring(1);
            System.out.printf("%d -> %s%n", currentNumber, special);
            sumDigit = 0;
            digit = currentNumber;
        }

    }

}

