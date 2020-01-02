package Lab;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        Map<String, Integer> counts = new LinkedHashMap<>();
        ArrayList<String> printing = new ArrayList<>();
        for (String word : words) {
            String wordLowerCase = word.toLowerCase();
            counts.putIfAbsent(wordLowerCase, 0);
            counts.put(wordLowerCase, counts.get(wordLowerCase) + 1);
        }
        for (Map.Entry<String, Integer> wordsToPrint : counts.entrySet()) {
            String key = wordsToPrint.getKey();
            int value = wordsToPrint.getValue();
            if (value % 2 != 0) {
                printing.add(key);
            }
        }
        System.out.print(printing.toString().
                replaceAll("\\[|\\]", ""));
    }
}
