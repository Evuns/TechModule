package listsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> first = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        List<String> second = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        List<String> combined = new ArrayList<>();

        for (int i = 0; i < Math.min(first.size(),second.size()) ; i++) {
            combined.add(first.get(i));
            combined.add(second.get(i));
            if(i == Math.min(first.size(),second.size()) - 1){

                for (int j = i + 1; j < Math.max(first.size(),second.size()) ; j++) {
                    if(first.size() > second.size()){
                        combined.add(first.get(j));
                    } else{
                        combined.add(second.get(j));
                    }
                }
            }
        }
        System.out.println(String.join(" ",combined));
    }
}
