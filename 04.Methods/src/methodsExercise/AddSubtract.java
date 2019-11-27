package methodsExercise;

import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int sum = sum(first,second);
        System.out.println(subtract(sum,third));
    }

    private static int sum(int first, int second){
        return first + second;
    }

    private static int subtract(int sum, int third){
        return sum - third;
    }
}