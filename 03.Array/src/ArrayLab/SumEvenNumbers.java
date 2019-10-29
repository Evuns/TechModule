package ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();

        for(Integer num : numbers){
            if(num % 2 == 0){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
