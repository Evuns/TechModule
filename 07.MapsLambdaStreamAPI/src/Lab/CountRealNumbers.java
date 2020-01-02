package Lab;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] input = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numbers = new TreeMap<>();

        for (double inputs : input) {
            if (!numbers.containsKey(inputs)) {
                numbers.put(inputs, 0);
            }
            numbers.put(inputs, numbers.get(inputs) + 1);
        }
        String pattern = "%.0f -> %d";
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()) {
            System.out.println(String.format(pattern, entry.getKey(), entry.getValue()));
        }
    }
}

