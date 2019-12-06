package listsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String command = scanner.nextLine();

        while(!"end".equalsIgnoreCase(command)){
            String [] toDo = command.split(" ");
            switch (toDo[0]){
                case"Add":
                    input.add(toDo[1]);
                    break;
                case"Remove":
                    input.remove(toDo[1]);
                    break;
                case"RemoveAt":
                    input.remove(Integer.parseInt(toDo[1]));
                    break;
                case"Insert":
                    input.add(Integer.parseInt(toDo[2]),toDo[1]);
                    break;
            }

            command = scanner.nextLine();
        }
        System.out.println(String.join(" ",input));
    }
}

