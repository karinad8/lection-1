public class AirlineOne {
    private double capacity;
    private double loadCapacity;
    private String color;
    private String name;
    private double releaseYear;
    private double flightRange;

    public AirlineOne(double capacity, double loadCapacity, String color, String name, double releaseYear, double flightRange) {
        this.capacity = capacity;
        this.loadCapacity = loadCapacity;
        this.color = color;
        this.name = name;
        this.releaseYear = releaseYear;
        this.flightRange = flightRange;
    }

    public double getCapacity () {
        return capacity;
    }
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getFlightRange() {
        return flightRange;
    }

}
