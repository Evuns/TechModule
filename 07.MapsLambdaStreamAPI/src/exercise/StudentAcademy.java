package exercise;


import java.util.*;
import java.util.stream.Collectors;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> students = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            students.putIfAbsent(name, grade);
            if (students.containsKey(name)) {
                double averageGrade = (students.get(name) + grade) / 2;
                students.put(name,averageGrade);
            }
        }
        Map<String, Double> printing = students.entrySet().stream().sorted((Map.Entry.<String, Double>comparingByValue().reversed()
        )).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

        String pattern = "%s -> %.2f";

        for (Map.Entry<String, Double> entry : printing.entrySet()) {
            String studentName = entry.getKey();
            double averageGrade = entry.getValue();

            if(averageGrade >= 4.50){
                System.out.println(String.format(pattern,studentName,averageGrade));
            }

        }
    }
}
