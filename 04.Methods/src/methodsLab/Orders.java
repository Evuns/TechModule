package methodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        total(drink,amount);

    }

    public static void total( String drink, int amount) {
        double price = 0;
        if ("coffee".equals(drink)){
            price = amount * 1.50;
        } else if ("water".equals(drink)){
            price = amount * 1.00;
        } else if ("coke".equals(drink)){
            price = amount * 1.40;
        } else {
            price = amount * 2.00;
        }
        System.out.printf("%.2f",price);
    }
}