package JavaIntroductionLab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int even = Integer.parseInt(scanner.nextLine());

        while (even % 2 != 0) {
            System.out.println("Please write an even number.");
            even = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("The number is: " + Math.abs(even));

    }

}

