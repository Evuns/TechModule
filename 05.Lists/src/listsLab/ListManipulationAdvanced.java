package listsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String[] command = scanner.nextLine().split(" ");

        while (!"end".equalsIgnoreCase(command[0])) {
            switch (command[0]) {
                case "Contains":
                    int contains = Integer.parseInt(command[1]);
                    if (input.contains(contains)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    if (command[1].equalsIgnoreCase("even")) {
                        for (Integer integer : input) {
                            if (integer % 2 == 0) {
                                System.out.print(integer + " ");
                            }
                        }
                    } else {
                        for (Integer integer : input) {
                            if (integer % 2 != 0) {
                                System.out.print(integer + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for (Integer integer : input) {
                        sum += integer;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int number = Integer.parseInt(command[2]);
                    if (command[1].equalsIgnoreCase("<")) {
                        for (Integer integer : input) {
                            if (integer < number) {
                                System.out.print(integer + " ");
                            }
                        }
                    } else if (command[1].equalsIgnoreCase(">")) {
                        for (Integer integer : input) {
                            if (integer > number) {
                                System.out.print(integer + " ");
                            }
                        }
                    } else if (command[1].equalsIgnoreCase(">=")) {
                        for (Integer integer : input) {
                            if (integer >= number) {
                                System.out.print(integer + " ");
                            }
                        }
                    } else {
                        for (Integer integer : input) {
                            if (integer <= number) {
                                System.out.print(integer + " ");
                            }
                        }
                    }
                    System.out.println();
            }
            command = scanner.nextLine().split(" ");
        }
    }
}
