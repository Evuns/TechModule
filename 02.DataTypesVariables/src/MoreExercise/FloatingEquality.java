package MoreExercise;

import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());

        final double THRESHOLD = .000001;


        if (Math.abs(num1 - num2) < THRESHOLD)
            System.out.println("True");
        else
            System.out.println("False");
    }
}


