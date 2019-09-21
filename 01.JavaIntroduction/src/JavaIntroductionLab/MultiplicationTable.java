package JavaIntroductionLab;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 10 ; i++) {
            int sum = num * i;

            System.out.println(num + " X " + i + " = " + sum);

        }

    }
}
