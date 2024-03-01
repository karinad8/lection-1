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
        System.out.println(Arrays.toString(array));
        CustomThread thread1 = new CustomThread(array);
        thread1.start();
        CustomThread thread2 = new CustomThread(array);
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Max is " + thread1.getMax());
        System.out.println("Min is " + thread1.getMin());
    }
}
