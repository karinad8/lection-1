import java.util.*;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Airline {
    private List<AirlineOne> capacityList = new ArrayList<>();
    private List<Double> flightRangeList = Arrays.asList(2357.678, 4576.876, 6587.87);

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
    public List<Double> sortedFlightRange = flightRangeList.stream()
            .sorted((s1,s2)->s2.compareTo(s1))
            .toList();

    }



