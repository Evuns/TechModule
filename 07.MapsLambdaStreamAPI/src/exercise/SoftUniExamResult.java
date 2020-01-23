package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> results = new HashMap<>();
        Map<String, Integer> submissions = new HashMap<>();
        String input = "";
        while (!"exam finished".equals(input = scanner.nextLine())) {
            String[] line = input.split("-");

            if (line.length == 3) {
                String name = line[0];
                String language = line[1];
                int points = Integer.parseInt(line[2]);
                if (!results.containsKey(name)) {
                    results.put(name, points);
                } else if (results.get(name) < points) {
                    results.put(name, points);
                }
                if (!submissions.containsKey(language)) {
                    submissions.put(language, 1);
                } else {
                    submissions.put(language, submissions.get(language) + 1);
                }
            } else {
                results.remove(line[0]);
            }
        }
        System.out.println("Results:");
        results.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s | %d",
                            entry.getKey(), entry.getValue()));
                });

        System.out.println("Submissions:");
        submissions.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue()
                        .reversed()
                        .thenComparing(Map.Entry.comparingByKey()))
                .forEach(entry -> {
                    System.out.println(String.format("%s - %d",
                            entry.getKey(), entry.getValue()));
                });

    }
}
