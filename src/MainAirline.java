import java.util.List;

public class MainAirline {
    public static void main(String[] args) {
        AirlineOne helicopter = new AirlineOne(5685, 56769, "white", "helicopter", 2000, 4565768);
        AirlineOne plane = new AirlineOne(667, 7788, "blue", "plane", 2006, 986546768);
        AirlineOne quadcopter = new AirlineOne(0, 2, "black", "quadcopter", 2012, 4567);
        Airline flightFacility = new Airline();
        flightFacility.addCapacity(helicopter);
        flightFacility.addCapacity(plane);
        flightFacility.addCapacity(quadcopter);
        System.out.println("Total capacity = " + flightFacility.getTotalCapacity());
        flightFacility.addFlightRange(helicopter);
        flightFacility.addFlightRange(plane);
        flightFacility.addFlightRange(quadcopter);

    }
}
