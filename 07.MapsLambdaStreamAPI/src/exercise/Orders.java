package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productPrice = new LinkedHashMap<>();
        Map<String, Integer> quantityProduct = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"buy".equalsIgnoreCase(input)) {
            String[] productDefinition = input.split("\\s+");
            String name = productDefinition[0];
            double price = Double.parseDouble(productDefinition[1]);
            int quantity = Integer.parseInt(productDefinition[2]);

            productPrice.put(name, price);

            quantityProduct.putIfAbsent(name, 0);
            quantityProduct.put(name, quantityProduct.get(name) + quantity);

            input = scanner.nextLine();
        }
        String pattern = "%s -> %.2f";
        for (Map.Entry<String, Double> product : productPrice.entrySet()) {
            System.out.println(String.format(pattern,product.getKey(),
                    product.getValue() * quantityProduct.get(product.getKey())));

        }

    }
}
