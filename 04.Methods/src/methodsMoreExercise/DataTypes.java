package methodsMoreExercise;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        switch (data) {
            case "int":
                int num = Integer.parseInt(scanner.nextLine());
                output(num);
                break;
            case "real":
                double a = Double.parseDouble(scanner.nextLine());
                output(a);
                break;
            case "string":
                String input = scanner.nextLine();
                output(input);
        }

    }

    public static void output(int num) {
        System.out.println(num * 2);
    }

    public static void output(double a) {
        System.out.printf("%.2f", a * 1.5);
    }

    public static void output(String input) {
        System.out.printf("$%s$", input);
    }

}

