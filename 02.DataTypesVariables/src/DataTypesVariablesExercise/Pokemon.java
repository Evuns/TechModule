package DataTypesVariablesExercise;

import java.util.Scanner;

public class Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokePowerN = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionFactorY = Integer.parseInt(scanner.nextLine());
        int pokeCounter = 0;
        int initialPokePower = pokePowerN;

        while (pokePowerN >= distanceM) {
            pokePowerN -= distanceM;
            pokeCounter++;

            if(pokePowerN == 0.5 * initialPokePower){
                    if(exhaustionFactorY > 0) {
                        pokePowerN /= exhaustionFactorY;
                    }
            }
        }
        System.out.println(pokePowerN);
        System.out.println(pokeCounter);
    }
}
