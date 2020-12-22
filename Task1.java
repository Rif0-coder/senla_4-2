package letion4day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Программа должна записать все введенные числа в массив. Вывести номера в диапазоне от 99 до 199
        Scanner in = new Scanner(System.in);
        System.out.println("kol-vo elementov");
        int a = in.nextInt();

        int[] massive = new int[a];

        for (int i = 0; i < massive.length; i++) {
            massive[i] = in.nextInt();
        }
        System.out.println("mas" + Arrays.toString(massive));

        for (int counter = 0; counter < massive.length; counter++) {
            if (massive[counter] >= 99 && massive[counter] <= 199) {
                System.out.print(massive[counter]);
            }
        }
    }
}
