package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new TreeMap<>();
        Map<String, Integer> keyMaterials = new TreeMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);

        int fragments = 0;
        int shards = 0;
        int motes = 0;

        while (fragments < 250 && shards < 250 && motes < 250) {
            String[] inputLine = scanner.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i < inputLine.length; i++) {
                int amount = Integer.parseInt(inputLine[i]);
                String material = inputLine[i + 1];
                i++;
                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    keyMaterials.put(material, keyMaterials.get(material) + amount);

                    if (material.equals("shards")) {
                        shards += amount;
                    } else if (material.equals("fragments")) {
                        fragments += amount;
                    } else {
                        motes += amount;
                    }

                } else {
                    materials.putIfAbsent(material, 0);
                    materials.put(material, materials.get(material) + amount);
                }
                if (fragments >= 250 || shards >= 250 || motes >= 250) {
                    break;
                }
            }
        }
        if (fragments >= 250) {
            System.out.println("Valanyr obtained!");
            keyMaterials.put("fragments", keyMaterials.get("fragments") - 250);
        } else if (shards >= 250) {
            System.out.println("Shadowmourne obtained!");
            keyMaterials.put("shards", keyMaterials.get("shards") - 250);
        } else {
            System.out.println("Dragonwrath obtained!");
            keyMaterials.put("motes", keyMaterials.get("motes") - 250);
        }

        String pattern = "%s: %d";


        Map<String, Integer> sorted = keyMaterials.entrySet()
                .stream().sorted((Map.Entry.<String,Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for (Map.Entry<String, Integer> entry : sorted.entrySet()) {
            System.out.println(String.format(pattern, entry.getKey(), entry.getValue()));
        }
        for (Map.Entry<String, Integer> entry : materials.entrySet()) {
            System.out.println(String.format(pattern, entry.getKey(), entry.getValue()));
        }
    }
}
