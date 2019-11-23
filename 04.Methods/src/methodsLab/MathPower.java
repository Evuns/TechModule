package methodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        int step = Integer.parseInt(scanner.nextLine());
        DecimalFormat format = new DecimalFormat("#.#####");
        System.out.printf("%s",format.format(power(number, step)));
    }

    private static double power(double number, int step) {
        double result = 1;
        for (int i = 0; i < step ; i++) {
            result *= number;

        }
        return result;
    }
}
