package listsLab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < lines; i++) {
            products.add(scanner.nextLine());
        }
        Collections.sort(products);
        int count = 0;
        for (String product : products) {
            count ++;
            System.out.println(count + "." + product);
        }
    }
}
