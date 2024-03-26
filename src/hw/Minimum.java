package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Minimum implements Runnable {

    @Override
    public void run() {

    }

    public int minimum(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
