package template;

public class MoonAdapter implements CosmicBody {
    private Moon moon;

    public MoonAdapter(Moon moon) {
        this.moon = moon;
    }

    @Override
    public double getVolume() {
        return moon.calculateArea();
    }
}

