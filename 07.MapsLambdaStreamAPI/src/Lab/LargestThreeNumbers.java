package Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted((a,b)-> b.compareTo(a)).limit(3).collect(Collectors.toList());

        System.out.println(numbers.toString().replaceAll("\\[|\\]|,", ""));
    }
}
