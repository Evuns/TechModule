package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sumEven = 0;
        int sumOdd = 0;

        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int num : array){
            if(num % 2 == 0){
                sumEven += num;
            } else{
                sumOdd += num;
            }
        }
        System.out.println(sumEven - sumOdd);
    }

}
