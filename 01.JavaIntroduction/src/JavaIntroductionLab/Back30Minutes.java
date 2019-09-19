package JavaIntroductionLab;

import java.util.Scanner;

public class Back30Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int newMinutes = minutes + 30;

        if(minutes > 30){
            hours ++;
            newMinutes -= 60;
        }
        if (hours > 23) {
            hours = 0;
        }
        System.out.printf("%d:%02d",hours, newMinutes );
    }
}
