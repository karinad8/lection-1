public class MainThree {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 23, -8, 7, 94, -9, -5};
        int[] positiveNumbers = new int[numbers.length];
        int[] negativeNumbers = new int[numbers.length];
        int positiveNumbersIndex = 0;
        int [] positiveNumbersWithOutZero = new int [5];
        int [] negativeNumbersWithOutZero = new int [3];
        int negativeNumbersIndex = 0;
        for (int i=0; i < numbers.length; i++){
            if (numbers[i] > 0) {
                positiveNumbers [positiveNumbersIndex] = numbers[i];
                positiveNumbersIndex++;
            }
            if (numbers[i] < 0) {
                negativeNumbers [negativeNumbersIndex] = numbers[i];
                negativeNumbersIndex++;
            }
        }
        System.arraycopy(positiveNumbers, 0, positiveNumbersWithOutZero, 0, positiveNumbersIndex++);
        for (int number : positiveNumbersWithOutZero){
            System.out.print(" " + number);
        }
        System.out.println();
        System.arraycopy(negativeNumbers, 0, negativeNumbersWithOutZero, 0, negativeNumbersIndex++);
        for (int number : negativeNumbersWithOutZero){
            System.out.print(" " + number);
        }
    }
}
