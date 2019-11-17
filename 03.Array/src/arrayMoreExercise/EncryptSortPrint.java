package arrayMoreExercise;

import java.util.Scanner;

public class EncryptSortPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int encrypt;
        int[] printArray = new int[num];
        for (int i = 0; i < num; i++) {
            String inputs = scanner.nextLine();
            int vowels = 0;
            int consonant = 0;
            for (int j = 0; j < inputs.length(); j++) {
                char letter = inputs.charAt(j);
                if (letter == 65 || letter == 69 || letter == 73 || letter == 79 || letter == 85 ||
                        letter == 97 || letter == 101 || letter == 105 || letter == 111 || letter == 117) {
                    vowels += letter * inputs.length();
                } else {
                    consonant += letter / inputs.length();
                }

            }
            encrypt = vowels + consonant;
            printArray[i] = encrypt;
        }
        for (int k = 0; k < printArray.length ; k++) {
            for (int j = 0; j < k + 1 ; j++) {
                if(printArray[k] < printArray[j]){
                    int temp = printArray[k];
                    printArray[k] = printArray[j];
                    printArray[j] = temp;
                }
            }
        }
        for (int value : printArray) {
            System.out.println(value);
        }
    }
}
