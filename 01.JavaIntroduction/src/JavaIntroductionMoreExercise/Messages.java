package JavaIntroductionMoreExercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int letters = Integer.parseInt(scanner.nextLine());
        int input = Integer.parseInt(scanner.nextLine());
        int firstDigit = 0;
        String output = "";
        int letter = 0;

        for (int i = 0; i < letters ; i++) {
            int numDigits = String.valueOf(input).length();
            for (int j = 1; j < numDigits; j++) {
                firstDigit = input % 10;
                input -= firstDigit;
                input /= 10;
            }
                firstDigit = input;
            int offset = (firstDigit - 2) * 3;
            if (firstDigit == 8 || firstDigit == 9){
                offset ++;
            }
            int letterIndex = (offset + numDigits - 1);
            if (letterIndex < 0){
                letter = 32;
            } else {
                letter = 97 + letterIndex;
            }
            char concatenatedOutput = (char)letter;
            output += Character.toString(concatenatedOutput);
            if(i == letters - 1){
                break;
            }
            input = Integer.parseInt(scanner.nextLine());

        }
            System.out.print(output);
    }
}
