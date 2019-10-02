package JavaIntroductionExercise;


import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int comparable = num;
        String number = String.valueOf(num);
        int sum = 0;
        int j, fact = 1;
        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = num % 10;
            for (j = 1; j <= digit; j++) {
                fact = fact * j;
            }
            sum += fact;
            num = (num - digit) / 10;
            fact = 1;
        }
        if (sum == comparable) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
