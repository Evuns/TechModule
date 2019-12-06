package listsLab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#######");
        List<Double> input = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        int initialSize = input.size();
        for (int i = 0; i < initialSize / 2; i++) {
            double newElement = input.get(i) + input.get(input.size() - 1);
            input.set(i, newElement);
            input.remove(input.size() - 1);

        }
        for (int i = 0; i < input.size(); i++) {
            System.out.printf("%s ", df.format(input.get(i)).trim());
        }
    }
}
