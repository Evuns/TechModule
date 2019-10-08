package DataTypesVariablesLab;

import java.util.Scanner;

public class PoundsDollars{

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        double pound = Double.parseDouble(scanner.nextLine());
        double dollars = pound * 1.31;

        System.out.printf("%.3f", dollars);

    }
}