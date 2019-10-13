package MoreExercise;

import java.util.Scanner;

public class DecryptingMessages{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String message = "";

        for(int i = 0; i <  n; i++){
            char letter = scanner.next().charAt(0);
            int newLetter = letter + key;
            message += (char)newLetter;
        }
        System.out.println(message);
    }
}
