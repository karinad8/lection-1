package template;

public class Earth {
    private double radius;

    public Earth(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return ((4 * Math.PI * Math.pow(radius, 3))/3);
    }
}
