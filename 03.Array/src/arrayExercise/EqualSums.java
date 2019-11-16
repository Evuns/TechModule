package arrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumLeft = 0;
        int sumRight = 0;
        boolean equal = false;

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                for (int j = i + 1; j < array.length; j++) {
                    sumRight += array[j];
                }
            }
            if (i != 0) {
                for (int k = i - 1; k >= 0; k--) {
                    sumLeft += array[k];
                }
            }
            if (sumLeft == sumRight) {
                System.out.println(i);
                equal = true;
            }
            sumLeft = 0;
            sumRight = 0;
        }

        if (!equal) {
            System.out.println("no");
        }
    }
}
