package JavaIntroductionMoreExercise;

import java.util.Scanner;

public class GamingStore{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        double currentBalance = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        double price = 0;
        double totalSpent = 0;

        while(!"Game Time".equals(input)){
            switch(input){
                case"OutFall 4":
                    price = 39.99;
                    break;
                case"CS: OG":
                    price = 15.99;
                    break;
                case"Zplinter Zell":
                    price = 19.99;
                    break;
                case"Honored 2":
                    price = 59.99;
                    break;
                case"RoverWatch":
                    price = 29.99;
                    break;
                case"RoverWatch Origins Edition":
                    price = 39.99;
                    break;
                default:
                    price = 0;
                    System.out.println("Not Found");
            }
            if (currentBalance < price && currentBalance !=0){
                System.out.println("Too Expensive");
            } else if (price != 0) {
                totalSpent += price;
                currentBalance -= price;
                System.out.println("Bought " + input);
            }
            if (currentBalance == 0){
                System.out.println("Out of money!");
                return;
            }

            input = scanner.nextLine();
        }
        System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, currentBalance);
    }
}
