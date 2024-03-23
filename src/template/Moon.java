package template;

public class Moon {
    private double radius;

    public Moon(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return ((4 * Math.PI * Math.pow(radius, 3))/3);
    }
}
