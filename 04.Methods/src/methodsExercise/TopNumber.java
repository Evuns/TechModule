package methodsExercise;


import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int candidate = divide(i);
            boolean odd = odd(candidate);
            if(odd){
                System.out.println(candidate);
            }
        }

    }

    public static int divide(int i) {
        int topNumber = 0;
        int candidate = i;
        int sumDigit = 0;
        while(i!=0){
            int digit = i % 10;
            sumDigit += digit;
            i = (i - digit) / 10;
        }
        if (sumDigit % 8 == 0) {
            topNumber = candidate;
        }
        return topNumber;
    }

    public static boolean odd(int candidate){
        boolean isOdd = false;
        while(candidate != 0) {
            int digit = candidate % 10;
            if (digit % 2 != 0) {
                isOdd = true;
                break;
            }
            candidate = (candidate - digit) /10;
        }
        return isOdd;
    }
}
