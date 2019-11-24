package methodsLab;

import java.util.Scanner;

public class GreaterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine().toLowerCase();
        String first = scanner.nextLine();
        String second = scanner.nextLine();

        switch (type) {
            case "string":
                System.out.println(getMax(first, second));
                break;
            case "int":
                int firstNum = Integer.parseInt(first);
                int secondNum = Integer.parseInt(second);
                System.out.println(getMax(firstNum, secondNum));
                break;
            case "char":
                System.out.println(getMax(first.charAt(0),second.charAt(0)));
                break;
        }

    }

    private static int getMax(int firstNum, int secondNum) {
        return Math.max(firstNum, secondNum);
    }

    private static char getMax(char a, char b) {
        int result = Math.max((int) a, (int) b);
        return ((char) result);
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) > 0) {
           return first;
        }
           return second;
    }
}