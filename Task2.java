package letion4day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            int rez = in.nextInt();
            if (rez != -1) {
                System.out.println(rez * 2);
            } else break;
        }
    }
}
