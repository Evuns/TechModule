package JavaIntroductionMoreExercise;

import java.util.Scanner;

public class SortNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int printFirst = 0;
        int printSecond = 0;
        int printThird = 0;

        if (first > second & first > third) {
            printFirst = Math.min(third, second);
            printSecond = Math.max(third, second);
            printThird = first;
        } else if (second > first & second > third) {
            printFirst = Math.min(first, third);
            printSecond = Math.max(first, third);
            printThird = second;
        } else {
            printFirst = Math.min(first, second);
            printSecond = Math.max(first, second);
            printThird = third;
        }
        System.out.println(printThird);
        System.out.println(printSecond);
        System.out.println(printFirst);
    }
}
