package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!"end".equalsIgnoreCase(command)) {
            List<String> doSomething = Arrays.stream(command.split(" "))
                    .collect(Collectors.toList());
            if (doSomething.size() > 1) {
                int extendTrain = Integer.parseInt(doSomething.get(1));
                wagons.add(extendTrain);
            } else {
                int morePassengers = Integer.parseInt(command);
                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + morePassengers <= maxCapacity) {
                        currentWagon += morePassengers;
                        wagons.set(i, currentWagon);
                        break;
                    }
                }
            }
            command = scanner.nextLine();
        }
        for (Integer wagon : wagons) {
            System.out.print("" + wagon + " ");
        }
    }
}
