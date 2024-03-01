package hw;

public class CustomThread extends Thread {
    private int[] array;
    private int max;
    private int min;

    public CustomThread(int[] array) {
        this.array = array;
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    @Override
    public void run() {
         max = array[0];
         min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if (min > array[i]) {
                min = array[i];
            }
        }
    }
}
