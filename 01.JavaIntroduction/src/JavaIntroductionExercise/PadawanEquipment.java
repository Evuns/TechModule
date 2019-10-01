package JavaIntroductionExercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());

        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightsabersNumber = Math.ceil(students + 0.1 * students);
        double beltNumber = students - Math.floor(students * 1.0 / 6);

        double sum = lightsabersPrice * lightsabersNumber + robePrice * students + beltPrice * beltNumber;

        if(sum <= amount){
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else{
            System.out.printf("Ivan Cho will need %.2flv more.", sum - amount);
        }
    }
}
