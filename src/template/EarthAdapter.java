package template;

public class EarthAdapter implements CosmicBody{
    private Earth earth;

    public EarthAdapter(Earth earth) {
        this.earth = earth;
    }

    @Override
    public double getVolume() {
        return earth.calculateArea();
    }
}

