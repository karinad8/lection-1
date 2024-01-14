import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        System.out.println("Enter the x-coordinate of the center of the circle : ");
        System.out.println("Enter the y-coordinate of the center of the circle : ");
        System.out.println("Enter the radius of the circle : ");
        System.out.println("Enter the x-coordinate of the point : ");
        System.out.println("Enter the y-coordinate of the point : ");
        setTheCondition(scanCoordinates(), scanCoordinates(), scanCoordinates(), scanCoordinates(), scanCoordinates());
        // не знаю как разбить, чтобы после каждого sout вводить число с клавиатуры, а не все сразу
    }

    public static int scanCoordinates() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void setTheCondition(int xCircle, int yCircle, int radius, int xPoint, int yPoint) {
        int xEndCircle1 = xCircle + radius;
        int xEndCircle2 = xCircle - radius;
        int yEndCircle1 = yCircle + radius;
        int yEndCircle2 = yCircle - radius;
        if (xEndCircle1 > xPoint && xEndCircle2 < xPoint && yEndCircle1 > yPoint && yEndCircle2 < yPoint) {
            System.out.println("The point is inside or on the circle");
        } else {
            System.out.println("The point is outside the circle");
        }

    }

}
