package methodsExercise;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        System.out.println(number(firstNum,secondNum,thirdNum));

    }

    public static int number(int firstNum, int secondNum, int thirdNum){
        int one = Math.min(firstNum, secondNum);
        int result = Math.min(one,thirdNum);
        return result;
    }
}
