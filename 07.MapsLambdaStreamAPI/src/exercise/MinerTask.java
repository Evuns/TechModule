package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> profit = new LinkedHashMap<>();

        while(!"stop".equalsIgnoreCase(command)){
            String resource = command;
            int amount = Integer.parseInt(scanner.nextLine());

            profit.putIfAbsent(resource,0);
            profit.put(resource,profit.get(resource) + amount);

            command = scanner.nextLine();
        }

        String pattern = "%s -> %d";

        for(Map.Entry<String, Integer> entry:profit.entrySet()){
            System.out.println(String.format(pattern,entry.getKey(),entry.getValue()));
        }
    }
}
