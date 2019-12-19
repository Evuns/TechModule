package listsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> program = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("3:1")) {
            String[] splitCommand = command.split("\\s+");
            String action = splitCommand[0];
            int startIndex = Integer.parseInt(splitCommand[1]);
            int finalIndex = Integer.parseInt(splitCommand[2]);
            startIndex = validateIndex(startIndex,program.size());
            finalIndex = validateIndex(finalIndex,program.size());

            switch (action) {
                case "merge":
                    if (startIndex == finalIndex){
                        break;
                    }else {
                        String marge = String.join("", program.subList(startIndex, finalIndex + 1));
                        program.subList(startIndex, finalIndex + 1).clear();
                        program.add(startIndex, marge);
                    }
                    break;
                case "divide":
                    int index =Integer.parseInt(splitCommand[1]);
                    int partitions = Integer.parseInt(splitCommand[2]);
                    List<String> result = divideEqually(program.get(index), partitions);
                    program.remove(index);
                    program.addAll(index,result);

                    break;
            }

            command = scanner.nextLine();
        }
        for (String s : program) {
            System.out.print(s + " ");
        }
    }

    private static List<String> divideEqually(String element, int partitions) {
        int part = element.length() / partitions;
        ArrayList<String> result = new ArrayList<>();
        while (element.length() >= part){
            result.add(element.substring(0,part));
            element = element.substring(part);
        }
        if (result.size() == partitions) {
            return result;
        }else {
            String concatLastTwoElements =
                    result.get(result.size()-2)
                            .concat(result.get(result.size()-1));
            result.subList(result.size()-2,result.size()).clear();
            result.add(concatLastTwoElements);
            return result;
        }
    }

    static int validateIndex (int index, int length){
        if (index < 0){
            index = 0;
        }if (index > length - 1){
            index = length - 1;
        }
        return index;
    }
}