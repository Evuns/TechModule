package methodsLab;

import java.util.Scanner;

public class MultiplyEvenByOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sumEven = 0;
        int sumOdd = 0;

        while (number != 0){
            int num = number % 10;
            number = (number - num) / 10;

            if (num % 2 == 0){
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println(multiply(sumEven, sumOdd));

    }
    private static int multiply(int sumEven, int sumOdd){
        return (sumEven * sumOdd);
    }
}
