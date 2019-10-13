package MoreExercise;

import java.util.Scanner;

public class BalancedBrackets {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean oppening = false;
        boolean closing = false;
        String output = "";
        int counter = 0;

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            if ("(".equals(input)) {
                oppening = true;
                counter++;
                if (counter > 1) {
                    output = "UNBALANCED";
                    break;
                }
            } else if (")".equals(input)) {
                closing = true;
                if (oppening == true) {
                    oppening = false;
                    closing = false;
                    counter = 0;
                    output = "BALANCED";
                } else {
                    output = "UNBALANCED";
                    break;
                }

            }
            if (oppening == true && closing == false) {
                output = "UNBALANCED";
            }
        }
        System.out.println(output);
    }
}

