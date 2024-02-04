public class Array {
    public static void main(java.lang.String[] args) {
        int n = 2;
        int m = 5;
        System.out.println("initial matrix \n");
        printArray(new int[m][n]);

        System.out.println();

        System.out.println("new matrix \n");
        printArray(new int[n][m]);
    }

    public static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = 2*i + j;
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }
    }
}

