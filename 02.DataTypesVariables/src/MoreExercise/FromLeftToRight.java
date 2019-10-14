package MoreExercise;

import java.util.Scanner;

public class FromLeftToRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        double firstNum = 0;
        double secondNum = 0;
        String numberOne = "";
        String numberTwo = "";
        int sumDigit = 0;
        for (int i = 0; i < lines; i++) {
            String numbers = scanner.nextLine();
            //   String[] words = numbers.split(" ", 2);
            for (int j = 0; j <= numbers.length() - 1; j++) {
                if (((char) 32) != (numbers.charAt(j))) {
                  numberOne += String.valueOf(numbers.charAt(j));
                } else {
                    numberTwo = numbers.substring(j + 1);
                    break;
                }
            }

            firstNum = Double.parseDouble(numberOne);
            secondNum = Double.parseDouble(numberTwo);
            // firstNum = Double.parseDouble(String.valueOf(words[0]));
            //secondNum = Double.parseDouble(String.valueOf(words[1]));

            if (firstNum > secondNum) {
                double numLength = String.valueOf(firstNum).length();
                for (int k = 0; k < numLength; k++) {
                    double digit = firstNum % 10;
                    sumDigit += digit;
                    firstNum = (firstNum - digit) / 10;
                }
            } else {
                int numLength = String.valueOf(secondNum).length();
                for (int k = 0; k < numLength; k++) {
                    double digit = secondNum % 10;
                    sumDigit += digit;
                    secondNum = secondNum / 10;
                }
            }
            System.out.println(Math.abs(sumDigit));
            sumDigit = 0;
            numberOne ="";
            numberTwo = "";
        }
    }
}

