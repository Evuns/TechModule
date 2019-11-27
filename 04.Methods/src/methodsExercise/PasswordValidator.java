package methodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        conditions(password);
    }

    private static void conditions(String password) {
        int length = password.length();
        if (length < 6 || length > 10){
            System.out.println("Password must be between 6 and 10 characters");
        }
        int digitCount = 0;
        boolean flag = false;
        for (int i = 0; i < password.length() ; i++) {
            char a = password.charAt(i);
            if(a > 47 && a < 58){
                digitCount ++;
            } else if( a < 65 || a > 90 && a < 97 || a >122){
                flag = true;
            }
        }
        if(flag) {
            System.out.println("Password must consist only of letters and digits");
        }
        if(digitCount < 2){
            System.out.println("Password must have at least 2 digits");
        }
        if(!flag && digitCount >= 2 && (length >= 6 && length <= 10)){
            System.out.println("Password is valid");
        }

    }
}