package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        String[] command = scanner.nextLine().split("\\s+");

        while (!"end".equalsIgnoreCase(command[0])) {
            if (command[0].equalsIgnoreCase("Delete")) {
                int delete = Integer.parseInt(command[1]);
                for (int i = 0; i < list.size(); i++) {
                    int current = list.get(i);
                    if (current == delete) {
                        list.remove(i);
                    }
                }
            } else {
                int insertAmount = Integer.parseInt(command[1]);
                int positionToInsert = Integer.parseInt(command[2]);
                if (positionToInsert >= 0 && positionToInsert < list.size()) {
                    list.add(positionToInsert, insertAmount);
                }
            }
            command = scanner.nextLine().split("\\s+");
        }
        System.out.println(list.toString().replaceAll("\\[|,|\\]", ""));
    }
}

