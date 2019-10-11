package DataTypesVariablesLab;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##################################################");

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 0; i < n; i++) {
            BigDecimal num = new BigDecimal(scanner.nextLine());
            sum = sum.add(num);
        }

        System.out.println(df.format(sum));

    }
}