package DataTypesVariablesLab;

import java.util.Scanner;

public class RefactorVolumePyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length, width,height, V = 0;
        length = Double.parseDouble(scanner.nextLine());
        width = Double.parseDouble(scanner.nextLine());
        height = Double.parseDouble(scanner.nextLine());
        System.out.print("Length: " );
        System.out.print("Width: " );
        System.out.print("Height: " );

        V = (length * width * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);


    }
}
