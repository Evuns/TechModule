package arrayExercise;
import java.util.Arrays;
import java.util.Scanner;

public class LadyBugs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fieldSize = Integer.parseInt(scanner.nextLine());
        int[] ladyBugs = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray(); // 0 1

        int[] arrayFieldSize = new int[fieldSize];
        for (int i = 0; i < arrayFieldSize.length; i++) {
            for (int ladyBug : ladyBugs) {
                if (ladyBug == i) {
                    arrayFieldSize[i] = 1;
                }
            }
        }

        String command = scanner.nextLine();

        while (!"end".equals(command)) {
            String[] movement = command.split(" ", 3);
            int position = Integer.parseInt(String.valueOf(movement[0]));
            int moves = Integer.parseInt(String.valueOf(movement[2]));
            for (int i = 0; i < arrayFieldSize.length; i++) {
                if (i == position) {
                    if (arrayFieldSize[i] == 1 && moves != 0) {
                        arrayFieldSize[i] = 0;
                        if ("right".equalsIgnoreCase(movement[1]) && i + moves >= 0 && i + moves < arrayFieldSize.length) {
                            while (i + moves < arrayFieldSize.length && i + moves > 0) {
                                if (arrayFieldSize[i + moves] == 0) {
                                    arrayFieldSize[i + moves] = 1;
                                    break;
                                } else {
                                    moves += moves;
                                }
                            }
                        } else if ("left".equalsIgnoreCase(movement[1]) && i - moves >= 0 && i - moves < arrayFieldSize.length) {
                            while (i - moves < arrayFieldSize.length && i - moves >= 0) {
                                if (arrayFieldSize[i - moves] == 0) {
                                    arrayFieldSize[i - moves] = 1;
                                    break;
                                } else {
                                    moves += moves;
                                }
                            }
                        }
                    } else if (arrayFieldSize[i] == 1 && moves == 0) {
                        arrayFieldSize[i] = 1;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (int value : arrayFieldSize) {
            System.out.print(value + " ");
        }
    }
}