package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().replaceAll(" ", "");
        Map<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            chars.putIfAbsent(current, 0);

            chars.put(current,chars.get(current) + 1);

        }
        String pattern = "%c -> %d";

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.println(String.format(pattern,entry.getKey(),entry.getValue()));

        }
    }
}