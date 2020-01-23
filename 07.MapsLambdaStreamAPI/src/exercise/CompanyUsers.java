package exercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> listCompany = new TreeMap<>();

        while (!"end".equalsIgnoreCase(input)) {
            String[] data = input.split("\\s+->\\s+");
            String company = data[0];
            String employee = data[1];

            listCompany.putIfAbsent(company, new ArrayList<>());
            if (listCompany.containsKey(company)) {
                if (listCompany.get(company).size() == 0) {
                    listCompany.get(company).add(employee);
                } else {
                    if (!listCompany.get(company).contains(employee))
                        listCompany.get(company).add(employee);
                }
            }
            input = scanner.nextLine();
        }

        for (String s : listCompany.keySet()) {
            System.out.printf("%s\n", s);
            for (int i = 0; i < listCompany.get(s).size(); i++) {
                System.out.printf("-- %s\n", listCompany.get(s).get(i));
            }
        }
    }
}