package template;

public class Sun {
    private double radius;

    public Sun(double radius) {
        this.radius = radius;
    }
    public double calculateArea() {
        return ((4 * Math.PI * Math.pow(radius, 3))/3);
    }
}
