package exercise;
import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = "";

        while (!"end".equals(input = scanner.nextLine())) {
            String[] data = input.split(" : ");

            String courseName = data[0].trim();
            String student = data[1].trim();

            if (!courses.containsKey(courseName)) {
                courses.put(courseName,new ArrayList<>());
            }
            courses.get(courseName).add(student);
        }

        courses.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Comparator.comparingInt(c -> c.getValue().size())))
                .forEach(c ->
                        System.out.printf("%s: %d%n-- %s%n",
                                c.getKey(),
                                c.getValue().size(),
                                Arrays.toString(c.getValue()
                                        .stream()
                                        .sorted(String::compareTo)
                                        .toArray())
                                        .substring(1,c.getValue().toString().length() - 1)
                                        .replaceAll(",","\n--"))
                );

    }
}