package JavaIntroductionExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double coins = 0;
        double sum = 0;

        while (!"Start".equals(input)) {
            coins = Double.parseDouble(input);

            if (coins == 0.1 || coins == 0.2 || coins == 0.5 || coins == 1 || coins == 2) {
                sum += coins;
            } else {
                System.out.printf("Cannot accept %.2f\n", coins);
            }
            input = scanner.nextLine();
        }

        input = scanner.nextLine();
        double price = 0;

        while (!"End".equals(input)) {
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;

                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
                if (sum < price) {
                    System.out.println("Sorry, not enough money");
                } else if ("Coke".equals(input) || "Soda".equals(input) || "Crisps".equals(input) || "Water".equals(input) || "Nuts".equals(input)){
                    System.out.println("Purchased " + input);
                    sum -= price;
                }


            input = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", sum);
    }
}

