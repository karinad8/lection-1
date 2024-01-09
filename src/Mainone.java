import java.util.Scanner;

public class Mainone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number =  scanner.nextInt();
        printSumAndMultiplicat(number);
    }
        public static void printSumAndMultiplicat(int number) {
            int currentLastDigit = 0;
            int currentNumber = number;
            int sum = 0;
            int multiplication = 1;
            while (currentNumber != 0) {
                currentLastDigit = currentNumber % 10;
                currentNumber /= 10;
                sum += currentLastDigit;
                multiplication *= currentLastDigit;
            }
            System.out.println("Sum: " + sum);
            System.out.println("Multiplication: " + multiplication);
        }
    }


