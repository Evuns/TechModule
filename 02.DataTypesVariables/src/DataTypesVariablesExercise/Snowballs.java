package DataTypesVariablesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballsN = Integer.parseInt(scanner.nextLine());
        long highestSnowballValue = 0;
        int highestSnowballSnow = 0;
        int highestSnowballTime = 0;
        int highestSnowballQuality = 0;
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;

        for (int i = 0; i < snowballsN; i++) {
            snowballSnow = Integer.parseInt(scanner.nextLine());
            snowballTime = Integer.parseInt(scanner.nextLine());
            snowballQuality = Integer.parseInt(scanner.nextLine());
            long snowballValue = (long) Math.pow((snowballSnow / snowballTime), snowballQuality);
            if (snowballValue > highestSnowballValue) {
                highestSnowballValue = snowballValue;
                highestSnowballSnow = snowballSnow;
                highestSnowballTime = snowballTime;
                highestSnowballQuality = snowballQuality;
            }

        }
        System.out.println(highestSnowballSnow + " : " + highestSnowballTime + " = " + highestSnowballValue + " (" + highestSnowballQuality + ")");

    }
}
