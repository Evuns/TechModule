package methodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());

        System.out.println(isNegative(num1, num2,num3));

    }
    static String isNegative (int num1, int num2, int num3){
        String result = " ";
        if(num1 > 0 && num2 > 0 && num3 > 0 ){
            result = "positive";
        } else if (num1 < 0 && num2 < 0 && num3 > 0 || num1 < 0 && num2 > 0 && num3 < 0 || num1 > 0 && num2 < 0 && num3 < 0){
            result = "positive";
        } else if (num1 == 0 || num2 == 0 || num3 == 0){
            result = "zero";
        } else{
            result = "negative";
        }
        return result;
    }
}

