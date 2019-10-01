package JavaIntroductionExercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length()-1; i >=0 ; i--) {
            password += username.charAt(i);
        }
        String input = scanner.nextLine();
        int counter = 0;
        while(!(password).equals(input) ){
            counter++;
            if(counter >= 4){
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            input = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}

