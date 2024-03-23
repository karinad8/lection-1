package template;

public class SunAdapter implements CosmicBody{
    private Sun sun;

    public SunAdapter(Sun sun) {
        this.sun = sun;
    }

    @Override
    public double getVolume() {
        return sun.calculateArea();
    }
}
