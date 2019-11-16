package arrayExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[lines];
        boolean arrayOne = true;
        String[] secondArray = new String[lines];

        for (int i = 0; i < firstArray.length; i++) {
            String[] input = scanner.nextLine().split(" ");
            if (arrayOne) {
                firstArray[i] = input[0];
                secondArray[i] = input[1];
                arrayOne = false;
            } else {
                secondArray[i] = input[0];
                firstArray[i] = input[1];
                arrayOne = true;
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
