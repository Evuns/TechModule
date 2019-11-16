package arrayExercise;
import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int numberInputs = 1;
        int longestOne = 0;
        int mostLeftPosition = 0;
        int[] bestDNA = new int[length];
        int biggestSum = 0;
        int bestInput = 1;

        while (!"Clone them!".equals(input)) {
            int[] dnaSample = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();
            int sumOfDna = 0;
            for (int dna : dnaSample) {
                if (dna == 1) {
                    sumOfDna++;
                }
            }
            for (int i = 0; i < dnaSample.length; i++) {
                if (dnaSample[i] == 1) {
                    int oneCounter = 1;
                    for (int j = i + 1; j < dnaSample.length; j++) {
                        if (dnaSample[j] == 1) {
                            oneCounter++;
                        } else {
                            break;
                        }
                    }
                    if (oneCounter > longestOne) {
                        longestOne = oneCounter;
                        mostLeftPosition = i;
                        bestDNA = dnaSample;
                        biggestSum = sumOfDna;
                        bestInput = numberInputs;
                    } else if (oneCounter == longestOne && mostLeftPosition > i ) {
                        mostLeftPosition = i;
                        bestDNA = dnaSample;
                        biggestSum = sumOfDna;
                        bestInput = numberInputs;
                    } else if (oneCounter == longestOne && mostLeftPosition == i && sumOfDna > biggestSum) {
                        bestDNA = dnaSample;
                        biggestSum = sumOfDna;
                        bestInput = numberInputs;
                    }
                }
            }

            input = scanner.nextLine();
            numberInputs++;
        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestInput, biggestSum);
        for (int dnas : bestDNA) {
            System.out.print(dnas + " ");
        }
    }
}
