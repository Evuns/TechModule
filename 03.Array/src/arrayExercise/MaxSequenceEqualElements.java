package arrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int counter = 1;
        int maxCounter = 0;
        int currentNum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                } else{
                    break;
                }
            }
            if (counter > maxCounter) {
                maxCounter = counter;
                currentNum = array[i];
            }
            counter = 1;
        }
        for (int i = 0; i < maxCounter ; i++) {
            System.out.print(currentNum + " ");
        }
    }
}

