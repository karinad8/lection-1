package OOP;

public class Array2 {
        public static void main(String[] args) {

/* int[][] anotherTwoDimensionalArray = { { 3, 2, 7 }, { 2, 6, 8 }, { 5, 1, 9} };

    for (int i = 0; i < anotherTwoDimensionalArray.length; ++i) {
        for(int j = 0; j < anotherTwoDimensionalArray[i].length; ++j) {
            System.out.print(anotherTwoDimensionalArray[i][j] + "\t");
        }
        System.out.println();
    }*/
            int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {10, 11, 12}
            };

            int maxSum = 0;
            int maxSumRow = 0;
            for (int i = 0; i < matrix.length; ++i) {
                int currentSum = 0;

                for (int j = 0; j < matrix[i].length; ++j) {
                    currentSum += matrix[i][j];
                }

                if (maxSum < currentSum) {
                    maxSum = currentSum;
                    maxSumRow = i;
                }
            }

            System.out.println("Row with max sum is " + maxSumRow);
        }
    }
