package moreExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Messaging {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> text = Arrays.stream(scanner.nextLine().split("")).collect(Collectors.toList());

        for (int number : numbers) {
            int sumDigit = 0;
            String length = "" + number;
            for (int i = 0; i < length.length(); i++) {
                int digit = number % 10;
                sumDigit += digit;
                number = (number - digit) / 10;
            }
            while (sumDigit > text.size()) {
                sumDigit -= text.size();
            }
            for (int i = 0; i < text.size(); i++) {
                if (i == sumDigit) {
                    System.out.print(text.get(i));
                    text.remove(i);
                    break;
                }
            }
        }
    }
}

