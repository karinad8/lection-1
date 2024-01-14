import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c) : ");
        getDiscriminantAndRoots(scanNumber(), scanNumber(), scanNumber());
    }

    public static int scanNumber() {
        Scanner scanner = new Scanner(System.in);
        return (int) scanner.nextDouble();
    }

    public static void getDiscriminantAndRoots(double a, double b, double c) {
        double number = Math.pow(b, 2) - 4 * a * c; // number = D;
        if (number > 0) {
            double firstX = ((-b) + Math.sqrt(number)) / 2 * a;
            double secondX = ((-b) - Math.sqrt(number)) / 2 * a;
            System.out.println("The quadratic equation has two distinct real roots : ");
            System.out.println("x1 = " + firstX);
            System.out.println("x2 = " + secondX);
        } else if (number == 0) {
            double theOnlyX = (-b) / 2 * a;
            System.out.println("The quadratic equation has only one real root : ");
            System.out.println("x = " + theOnlyX);
        } else {
            System.out.println("The quadratic equation has no roots");
        }
    }
}
