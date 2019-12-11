package listsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String> participants = new ArrayList<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] names = scanner.nextLine().split("\\s+");
            if (names.length < 4) {
                if (participants.contains(names[0])) {
                    System.out.println(names[0] + " is already in the list!");
                } else {
                    participants.add(names[0]);
                }
            } else {
                if (participants.contains(names[0])) {
                    participants.remove(names[0]);
                } else {
                    System.out.println(names[0] + " is not in the list!");
                }
            }
        }
        for (String participant : participants) {
            System.out.println(participant);
        }
    }
}
