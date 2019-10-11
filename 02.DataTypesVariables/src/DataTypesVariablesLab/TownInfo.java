package DataTypesVariablesLab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#############");

        String city = scanner.nextLine();
        long population = Long.parseLong(scanner.nextLine());
       // double area = Double.parseDouble(scanner.nextLine());
        BigDecimal area = new BigDecimal(scanner.nextLine());
        System.out.printf("Town %s has population of %d and area %s square km.", city,population,df.format(area));

    }
}
