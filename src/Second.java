import java.util.Arrays;

public class Second {
    public static void main(String[] args) {
        int[] array = {4, -7, 67, 67, 2, -45, 99, 5, -7, 45, 4};
        System.out.println("Original array: " + "\n" + Arrays.toString(array));
        array = Arrays.stream(array).distinct().toArray();
        System.out.println("Array after removing duplicates: " + "\n" + Arrays.toString(array));
    }
}
