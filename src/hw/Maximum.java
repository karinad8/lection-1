package hw;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum implements Runnable {

    @Override
    public void run() {
    }

    public int maximum(int[] array) {
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
