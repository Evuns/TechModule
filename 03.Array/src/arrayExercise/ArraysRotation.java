package arrayExercise;
import java.util.Scanner;

public class ArraysRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        String temporary;

        for (int i = 0; i < n ; i++) {
            temporary = array[0];
            String [] newArray = new String [array.length];
            for (int j = 0; j <= array.length - 1 ; j++) {
                if (j == array.length - 1){
                    newArray [j] = temporary;
                } else {
                    newArray[j] = array[j + 1];
                }
            }

            array = newArray;
        }
        System.out.println(String.join(" ", array));
    }
}
