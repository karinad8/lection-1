package template;

public class Main {
    public static void main(String[] args) {
        Earth earth = new Earth(6371);
        Moon moon = new Moon(1737.4);
        Sun sun = new Sun(696340);

        CosmicBody cosmicBodyEarth = new EarthAdapter(earth);
        System.out.println("Earth volume:" + cosmicBodyEarth.getVolume());

        CosmicBody cosmicBodyMoon = new MoonAdapter(moon);
        System.out.println("Moon volume:" + cosmicBodyMoon.getVolume());

        CosmicBody cosmicBodySun = new SunAdapter(sun);
        System.out.println("Sun volume:" + cosmicBodySun.getVolume());
    }
}
