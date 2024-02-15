import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Airline {
    private List<AirlineOne> capacityList = new ArrayList<>();
    private List<AirlineOne> loadCapacityList = new ArrayList<>();
    private List<Double> flightRangeList = new ArrayList<>();

    public void addLoadCapacity(AirlineOne newCapacity) {
        loadCapacityList.add(newCapacity);
    }

    public void addCapacity(AirlineOne newCapacity) {
        capacityList.add(newCapacity);
    }

    public void addFlightRange(AirlineOne newFlightRange) {
        capacityList.add(newFlightRange);
    }


    public double getTotalCapacity() {
        double totalCapacity = 0;
        for (AirlineOne capacity : capacityList) {
            totalCapacity += capacity.getCapacity();
        }
        return totalCapacity;
    }

    public double getTotalLoadCapacity() {
        double totalLoadCapacity = 0;
        for (AirlineOne loadCapacity : loadCapacityList) {
            totalLoadCapacity += loadCapacity.getLoadCapacity();
        }
        return totalLoadCapacity;
    }


    public void sortBasedOnFlightRange() {
        Collections.sort(flightRangeList);
        for (Double element : flightRangeList) {
            System.out.println(element + "\t");
        }
    }
}

