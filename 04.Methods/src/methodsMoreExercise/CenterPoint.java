package methodsMoreExercise;

import java.util.Scanner;

public class CenterPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int y1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int y2 = Integer.parseInt(scanner.nextLine());

        coordinates(x1,y1,x2,y2);
    }

    public static void coordinates(int x1, int y1, int x2, int y2) {
        int x = 0;
        int y = 0;
        int minX = Math.min(x1,x2);
        int minY = Math.min(y1,y2);
        if(minX == x1){
            if (minY == y1) {
                x = x1;
                y = y1;
            } else {
                if (Math.abs(x2) - Math.abs(x1) > Math.abs(y1) - Math.abs(y2)){
                    x = x1;
                    y = y1;
                }else{
                    x = x2;
                    y = y2;
                }
            }
        } else if (minX == x2){
            if (minY == y2) {
                x = x2;
                y = y2;
            } else {
                if (Math.abs(x1) - Math.abs(x2) > Math.abs(y2) - Math.abs(y1)){
                    x = x2;
                    y = y2;
                }else{
                    x = x1;
                    y = y1;
                }
            }
        }
        System.out.println("(" + x + ", " + y + ")");
    }
}
