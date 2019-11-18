package arrayMoreExercise;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedNumber = Integer.parseInt(scanner.nextLine());

        long[] fibonacci = new long[wantedNumber];

        if (wantedNumber <= 0) {
            System.out.println(0);
        } else {
            for (int i = 0; i < fibonacci.length; i++) {
                if (i == 0 || i == 1) {
                    fibonacci[i] = 1;
                } else {
                    fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
                }
            }
            System.out.println(fibonacci[wantedNumber - 1]);
        }
    }
}
