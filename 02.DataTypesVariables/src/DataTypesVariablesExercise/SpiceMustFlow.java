package DataTypesVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int dayCounter = 0;
        long totalAmount = 0;
        int crewConsumes = 26;

        while (startingYield >= 100) {
            dayCounter++;
            totalAmount += startingYield - crewConsumes;
            startingYield -= 10;
        }
            if(totalAmount >= 26) {
                totalAmount -= crewConsumes;
            }
        System.out.println(dayCounter);
        System.out.println(totalAmount);
    }
}
