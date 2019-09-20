package JavaIntroductionLab;

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int count = 0;

        for (int j = 1; j <= 100; j += 2) {
            System.out.println(j);
            sum += j;
            count++;
            if (count >= n) {
                break;
            }
        }
        System.out.printf("Sum: %d", sum);
    }
}
