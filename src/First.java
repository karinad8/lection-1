import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arrayFirst = {2, 55, 23, 98, 6};
        int[] arraySecond = {8, 12, 99, 56, 74};
        int[] result = new int[arrayFirst.length + arraySecond.length];
        int i = 0;
        for (int element : arrayFirst) {
            result[i++] = element;
        }
        for (int element : arraySecond) {
            result[i++] = element;
        }
        Arrays.sort(result);
        for (int k : result) {
            System.out.print(k + "\t");
        }
    }
}
