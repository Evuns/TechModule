package JavaIntroductionExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double pay = 0;
        double price = 0;

        switch (type) {
            case "Students":
                if ("Friday".equals(day)) {
                    pay = 8.45;
                } else if ("Saturday".equals(day)) {
                    pay = 9.80;
                } else{
                    pay = 10.46;
                }
                price = pay * people;
                if (people >= 30) {
                    price -= price * 0.15;
                }
                break;
            case "Business":
                if ("Friday".equals(day)) {
                    pay = 10.90;
                } else if ("Saturday".equals(day)) {
                    pay = 15.60;
                } else{
                    pay = 16;
                }
                price = pay * people;
                if (people >= 100) {
                    price -= pay * 10;
                }
                break;
            case "Regular":
                if ("Friday".equals(day)) {
                    pay = 15;
                } else if ("Saturday".equals(day)) {
                    pay = 20;
                } else{
                    pay = 22.50;
                }
                price = pay * people;
                if (people >= 10 && people <= 20) {
                    price -= price * 0.05;
                }
                break;
        }
        System.out.printf("Total price: %.2f" , price);
    }
}

