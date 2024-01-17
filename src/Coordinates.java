import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        System.out.println("Enter the x-coordinate of the center of the circle : ");
        int centerX = scanCoordinates();
        System.out.println("Enter the y-coordinate of the center of the circle : ");
        int centerY = scanCoordinates();
        System.out.println("Enter the radius of the circle : ");
        int radius = scanCoordinates();
        System.out.println("Enter the x-coordinate of the point : ");
        int pointX = scanCoordinates();
        System.out.println("Enter the y-coordinate of the point : ");
        int pointY = scanCoordinates();
        printIsPointInsideCircle(centerX, centerY, radius, pointX, pointY);
    }

    public static int scanCoordinates() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void printIsPointInsideCircle(int xCircle, int yCircle, int radius, int xPoint, int yPoint) {
        int xEndCircle1 = xCircle + radius;
        int xEndCircle2 = xCircle - radius;
        int yEndCircle1 = yCircle + radius;
        int yEndCircle2 = yCircle - radius;
        if (Math.sqrt(Math.pow(Math.abs(xPoint - xCircle),2) + Math.pow(Math.abs(yPoint - yCircle),2)) < radius) {
            System.out.println("The point is inside or on the circle");
        } else {
            System.out.println("The point is outside the circle");
        }

    }

}
