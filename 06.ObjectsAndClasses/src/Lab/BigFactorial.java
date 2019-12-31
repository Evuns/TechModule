package Lab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        BigInteger sum = BigInteger.ONE;
        for (int i = 1; i <= num ; i++) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        System.out.println(sum);
    }
}
