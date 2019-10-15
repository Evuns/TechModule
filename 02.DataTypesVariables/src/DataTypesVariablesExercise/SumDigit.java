package DataTypesVariablesExercise;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int sumDigit = 0;
  //      int length = Integer.toString(num).length();

   //     for (int i = 0; i < length; i++) {
        while (num > 0){
           int digit = num % 10;
            sumDigit += digit;
            num /= 10;
        }
        System.out.println(sumDigit);
    }
}
