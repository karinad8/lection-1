public class Array {
    public static void main(String[] args) {
        int n = 2;
        int m = 5;
        int[][] a = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = i + 2 * j;
            }
        }

        System.out.println("initial matrix \n");
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                System.out.printf("%3d", a[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = i + 2 * j;
            }
        }

            System.out.println();
            System.out.println("new matrix \n");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("%3d", a[i][j]);
                }
                System.out.println();
            }

        }
    }

