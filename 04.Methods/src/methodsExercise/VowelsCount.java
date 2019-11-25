package methodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();

        System.out.println(vowels(input));
    }

    private static int vowels(String input){
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            if( a == 'a' || a == 'e' || a == 'i'|| a == 'o' || a == 'u'){
                count ++;
            }
        }
        return count;
    }
}
