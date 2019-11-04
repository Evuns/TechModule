package arrayExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int[] array = new int[wagons];
        int sumPeople = 0;

        for (int i = 0; i < wagons; i++) {
            int peopleInWagon = Integer.parseInt(scanner.nextLine());
            sumPeople += peopleInWagon;
            array[i] = peopleInWagon;
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(sumPeople);
    }
}
