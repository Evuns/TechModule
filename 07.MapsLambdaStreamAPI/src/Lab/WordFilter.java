package Lab;
import java.util.Scanner;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] words = scanner.nextLine().split("\\s+");

        for (String word:words) {
            if (word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }
}
