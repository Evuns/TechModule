package JavaIntroductionMoreExercise;

import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder sb = new StringBuilder(input);
//        String output = "";
//        for (int i = input.length() - 1; i >= 0; i--){
//            output += input.charAt(i);
//        }
        System.out.println(sb.reverse().toString());
    }
}