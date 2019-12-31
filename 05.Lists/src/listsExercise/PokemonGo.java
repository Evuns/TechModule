package listsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pokemon = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> removed = new ArrayList<>();

        while (!pokemon.isEmpty()) {
            int indexToRemove = Integer.parseInt(scanner.nextLine());
            if (indexToRemove < 0) {
                removed.add(pokemon.get(0));
                int value = pokemon.get(0);
                int lastKeeper = pokemon.get(pokemon.size() - 1);
                pokemon.set(0, lastKeeper);
                newPokemon(pokemon,value);
            } else if (indexToRemove > pokemon.size() - 1) {
                removed.add(pokemon.get(pokemon.size() - 1));
                int value = pokemon.get(pokemon.size() - 1);
                int firstKeeper = pokemon.get(0);
                pokemon.set(pokemon.size() - 1, firstKeeper);
                newPokemon(pokemon,value);
            } else {
                int value = pokemon.get(indexToRemove);
                pokemon.remove(indexToRemove);
                removed.add(value);
              newPokemon(pokemon,value);
            }
        }
        int finalSum = 0;
        for (Integer integer : removed) {
            finalSum += integer;
        }
        System.out.println(finalSum);
    }

    private static List<Integer> newPokemon(List<Integer> pokemon, int value){
        for (int i = 0; i < pokemon.size(); i++) {
            int currentValue = pokemon.get(i);
            if (currentValue <= value) {
                currentValue += value;
                pokemon.set(i, currentValue);
            } else {
                currentValue -= value;
                pokemon.set(i, currentValue);
            }
        }
        return pokemon;
    }
}