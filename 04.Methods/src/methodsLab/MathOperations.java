package methodsLab;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        int secondNum = Integer.parseInt(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(result(firstNum, operator, secondNum)));

    }

    private static double result(int a, char operator, int b) {
        double result;
        if (operator == 42) {
            result = a * b;
        } else if (operator == 43) {
            result = a + b;
        } else if (operator == 47) {
            result = a / b;
        } else {
            result = a - b;
        }
        return result;
    }
}
