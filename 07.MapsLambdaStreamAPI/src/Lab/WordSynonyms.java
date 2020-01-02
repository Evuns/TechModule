package Lab;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<String>> wordsSynonyms = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();
            wordsSynonyms.putIfAbsent(word, new ArrayList<>());
            wordsSynonyms.get(word).add(synonym);
        }
        String pattern = "%s - %s";
        for (Map.Entry<String, ArrayList<String>> entry : wordsSynonyms.entrySet()) {
            String key = entry.getKey();
            String value = String.join(", ", entry.getValue());
            System.out.println(String.format(pattern, key, value));
        }
    }
}