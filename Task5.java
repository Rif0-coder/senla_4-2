package letion4day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int elNumber = in.nextInt();
        int[] mas = new int[elNumber];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = in.nextInt();
        }
        System.out.println("mas " + Arrays.toString(mas));
        // Arrays.sort(mas);
        // System.out.println("min" + mas[0] + "\n" + "max" + mas[mas.length-1]);

        // Get max min value
        int maxValue = mas[0];
        int minValue = mas[0];
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > maxValue) {
                maxValue = mas[i];
            }
            if (mas[i] < minValue) {
                minValue = mas[i];
            }
        }
        System.out.println("max: " + maxValue + "\n" + "min: " + minValue);
    }
}
