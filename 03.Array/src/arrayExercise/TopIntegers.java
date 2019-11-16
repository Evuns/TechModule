package arrayExercise;


import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int currentMaxValue;
        for (int i = 0; i < array.length; i++) {
            currentMaxValue = array[i];
            if (i == array.length - 1) {
                System.out.println(array[i]);
                break;
            }
            for (int j = i + 1; j < array.length; j++) {
                if (currentMaxValue <= array[j]) {
                    break;
                }
                if (j == array.length - 1) {
                    System.out.print(currentMaxValue + " ");
                }
            }
        }
    }
}
