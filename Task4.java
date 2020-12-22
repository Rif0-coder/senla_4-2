package letion4day2;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("kol-vo elementov");
        int a = in.nextInt();
        int[] mas = new int[a];
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = in.nextInt();
            count++;
            if (count == 5) {
                mas[i] = 111111111;
                count = 0;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
