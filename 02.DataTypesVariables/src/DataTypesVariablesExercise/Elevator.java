package DataTypesVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nPeople = Integer.parseInt(scanner.nextLine());
        int pCapacity = Integer.parseInt(scanner.nextLine());
        double courses = Math.ceil(nPeople * 1.0 / pCapacity);

        System.out.printf("%.0f", courses);
    }
}
