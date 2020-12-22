package letion4day2;

import java.util.Scanner;

// элементы которые больше суммы соседних. Начинаемсовторого.
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }
        for (int j = 1; j < myArray.length - 1; j++) {
            if (myArray[j] > myArray[j - 1] + myArray[j + 1]) {
                System.out.println("number " + myArray[j] + "\t index of " + j);
            }
        }
    }
}
