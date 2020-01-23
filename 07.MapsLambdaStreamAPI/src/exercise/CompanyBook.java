package exercise;

import java.util.*;

public class CompanyBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> forceBook = new LinkedHashMap<>();

        String input = "";

        while (!"Lumpawaroo".equals(input = scanner.nextLine())) {

            String[] data = Arrays.stream(input
                    .split("\\s+\\|\\s+|\\s+->\\s+"))
                    .toArray(String[]::new);

            if (input.contains("|")) {
                String forceSide = data[0];
                String forceUser = data[1];

                if (!forceBook.containsKey(forceSide)) {

                    forceBook.put(forceSide, new TreeSet<>());
                }
                if (forceBook.entrySet().stream().noneMatch(e ->
                        e.getValue().contains(forceUser))) {
                    forceBook.get(forceSide).add(forceUser);
                }
            } else {
                String forceUser = data[0];
                String forceSide = data[1];

                forceBook.forEach((key, value) -> {
                    value.remove(forceUser);
                });


                if (!forceBook.containsKey(forceSide)) {
                    forceBook.put(forceSide, new TreeSet<>());
                }

                forceBook.get(forceSide).add(forceUser);
                System.out.println(String.format("%s joins the %s side!", forceUser, forceSide));

            }

        }
        forceBook.entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 0)
                .sorted((e1, e2) -> {
                    int sort = Integer.compare(e2.getValue().size(), e1.getValue().size());

                    if (sort == 0) {
                        sort = e1.getKey().compareTo(e2.getKey());
                    }
                    return sort;
                }).forEach(kvp -> {

            System.out.println(String.format("Side: %s, Members: %d", kvp.getKey(), kvp.getValue().size()));
            kvp.getValue().forEach(u -> {
                System.out.println(String.format("! %s", u));
            });
        });

    }


}
