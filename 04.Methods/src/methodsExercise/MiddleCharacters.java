package methodsExercise;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        System.out.println(middle(word));
    }
    private static String middle(String word){
        String middleChar = "";
        int length = word.length();
        if(length % 2 !=0){
            middleChar = word.charAt( length / 2) + "";
        } else{
            middleChar ="" + word.charAt(length / 2 - 1) + word.charAt(length / 2);
        }
        return middleChar;
    }
}