package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> line = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        int[] bombPower = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int bomb = bombPower[0];
        int power = bombPower[1];


        for (int i = 0; i < line.size(); i++) {
            if (line.get(i) == bomb) {
                for (int j = 0; j < power; j++) {
                    if (i + 1 < line.size()) {
                        line.remove(i + 1);
                    }
                    if (i - 1 >= 0) {
                        line.remove(i - 1);
                        i--;
                    }
                }

                line.remove(i);
                if(power == 0){
                    i--;
                }
            }

        }
        int sum = 0;
        for (Integer integer : line) {
            sum += integer;
        }
        System.out.println(sum);
    }
}
