package ArrayLab;

import java.util.Scanner;

public class NumbersReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        for (int num = n - 1; num >= 0; num--) {
            System.out.print(numbers[num] + " ");
        }
    }
}

