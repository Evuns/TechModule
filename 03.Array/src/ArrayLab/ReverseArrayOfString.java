package ArrayLab;

import java.util.Scanner;

public class ReverseArrayOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a;

        String[] array = scanner.nextLine().split(" ");
        for (int i = 0; i <= (array.length - 1) / 2; i++) {
            a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
        System.out.println(String.join(" ", array));
    }

}
