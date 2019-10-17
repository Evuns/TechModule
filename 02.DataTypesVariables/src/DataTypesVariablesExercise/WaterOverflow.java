package DataTypesVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());
        int sumLitters = 0;

        for (int i = 0; i < n; i++) {
            int litters = Integer.parseInt(scanner.nextLine());
            if (capacity < litters) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= litters;
                sumLitters += litters;
            }
        }

        System.out.println(sumLitters);
    }
}
