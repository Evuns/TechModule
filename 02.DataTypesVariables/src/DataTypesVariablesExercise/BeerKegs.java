package DataTypesVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nLines = Integer.parseInt(scanner.nextLine());
        double volume = Double.MIN_VALUE;
        String biggestModel = "";

        for (int i = 0; i < nLines ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double currentVolume = Math.PI * (Math.pow(radius, 2)) * height;
            if (currentVolume > volume){
                volume = currentVolume;
                biggestModel = model;
            }
        }
        System.out.println(biggestModel);
    }
}
