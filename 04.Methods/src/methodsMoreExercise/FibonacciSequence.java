package methodsMoreExercise;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        fibonacci(num);
    }

    public static void fibonacci(int num) {
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int number = 0;
        for (int i = 0; i < num; i++) {

            if (i == 0) {
                firstNum = 1;
                number = firstNum;
            } else if (i == 1) {
                number = secondNum = 1;
            } else if (i == 2) {
                thirdNum = firstNum + secondNum;
                number = thirdNum;
            } else {
                number = firstNum + secondNum + thirdNum;
            }
            System.out.print(number + " ");
            if (i > 2) {
                firstNum = secondNum;
                secondNum = thirdNum;
                thirdNum = number;
            }

        }

    }
}

