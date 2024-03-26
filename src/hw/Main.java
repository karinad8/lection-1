package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array : ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Fill the array : ");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        Maximum max = new Maximum();
        Thread threadMax = new Thread(max);

        Minimum min = new Minimum();
        Thread threadMin = new Thread(min);

        threadMax.start();
        threadMin.start();
        try {
            threadMax.join();
            threadMin.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Max is " + max.maximum(array));
        System.out.println("Min is " + min.minimum(array));
    }
}
