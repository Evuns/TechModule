package listsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();

        while (!input.equals("course start")){
            String [] tokens = input.split(":");
            String command = tokens [0];
            String lessonTitle = tokens[1];

            switch (command) {
                case "Add":
                    if (!lessons.contains(lessonTitle)) {
                        lessons.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(tokens[2]);
                    if (!lessons.contains(lessonTitle)) {
                        if (index >= 0 && index < lessons.size()) {
                            lessons.add(index, lessonTitle);
                        }
                    }

                    break;
                case "Remove":
                    lessons.remove(lessonTitle);
                    lessons.remove(lessonTitle + "Exercise");

                    break;
                case "Swap":
                    if (lessons.contains(lessonTitle) && lessons.contains(tokens[2])) {
                        int indexOne = lessons.indexOf(tokens[1]);
                        int indexTwo = lessons.indexOf(tokens[2]);

                        lessons.add(indexTwo, lessonTitle);
                        lessons.remove(tokens[2]);
                        lessons.remove(indexOne);
                        lessons.add(indexOne, tokens[2]);

                        if (lessons.contains(lessonTitle + "-Exercise")) {
                            if (indexTwo == lessons.size() - 1) {
                                lessons.add(lessonTitle + "-Exercise");
                            } else {
                                lessons.add(indexTwo + 1, lessonTitle + "-Exercise");
                            }
                            lessons.remove(indexOne + 2);

                        } else if (lessons.contains(tokens[2] + "-Exercise")) {
                            if (indexOne == lessons.size() - 1) {
                                lessons.add(tokens[2] + "-Exercise");
                            } else {
                                lessons.add(indexOne + 1, tokens[2] + "-Exercise");
                            }
                            lessons.remove(indexTwo + 2);
                        }
                    }
                    break;
                case "Exercise":
                    if (lessons.contains(lessonTitle) && !lessons.contains(lessonTitle + "-Exercise")){
                        lessons.add(lessons.indexOf(lessonTitle) + 1, lessonTitle + "-Exercise");
                    }else if (!lessons.contains(lessonTitle + "-Exercise")){
                        lessons.add(lessonTitle);
                        lessons.add(lessonTitle + "-Exercise");
                    }

                    break;
            }
            input = scan.nextLine();
        }
        int index = 1;
        for (String lesson : lessons) {
            System.out.println(index + "." + lesson);
            index++;
        }

    }
}