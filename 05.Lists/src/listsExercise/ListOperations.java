package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"end".equalsIgnoreCase(command)) {
            String[] toDo = command.split("\\s+");
            switch (toDo[0]) {
                case "Add":
                    int addEnd = Integer.parseInt(toDo[1]);
                    integerList.add(addEnd);
                    break;
                case "Insert":
                    int insertNumber = Integer.parseInt(toDo[1]);
                    int index = Integer.parseInt(toDo[2]);
                    if(index < integerList.size() && index >=0) {
                        integerList.add(index, insertNumber);
                    } else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int indexToRemove = Integer.parseInt(toDo[1]);
                    if(indexToRemove < integerList.size() && indexToRemove >=0) {
                        integerList.remove(indexToRemove);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    int repeat = Integer.parseInt(toDo[2]);
                    if (toDo[1].equalsIgnoreCase("left")) {
                        for (int i = 0; i < repeat ; i++) {
                            integerList.add(integerList.size(), integerList.get(0));
                            integerList.remove(0);
                        }
                    } else {
                        for (int i = 0; i < repeat ; i++) {
                            integerList.add(0, integerList.get(integerList.size()-1));
                            integerList.remove(integerList.size()-1);
                        }

                    }
            }
            command = scanner.nextLine();
        }
        System.out.println(integerList.toString().replaceAll("\\[|,|\\]", ""));
    }
}
