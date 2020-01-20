package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> customers = new LinkedHashMap<>();

        for (int i = 0; i < n ; i++) {
            String [] command = scanner.nextLine().split("\\s+");
            String toDo = command[0];
            String username = command[1];
            if ("register".equalsIgnoreCase(toDo)) {
                String licensePlateNumber = command[2];
                if(customers.containsKey(username)){
                    System.out.println("ERROR: already registered with plate number "+ customers.get(username));
                } else {
                    customers.putIfAbsent(username, licensePlateNumber);
                    System.out.printf("%s registered %s successfully\n", username,licensePlateNumber);
                }
            } else{
                if(customers.containsKey(username)){
                    System.out.printf("%s unregistered successfully\n", username);
                    customers.remove(username);
                } else{
                    System.out.printf("ERROR: user %s not found\n", username);
                }
            }
        }
        String pattern = "%s => %s";

        for(Map.Entry<String, String> entry:customers.entrySet()){
            String username = entry.getKey();
            String licensePlateNumber = entry.getValue();
            System.out.println(String.format(pattern,username,licensePlateNumber));
        }
    }
}
