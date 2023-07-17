import java.util.ArrayList;
import java.util.List;

public class ParkingPlace extends Cars {

    int maxCapacityOfCars = 20;
    List<String> cars = new ArrayList<>();
    int numberOfCars = 0;

    public ParkingPlace(String type, int maxPeopleInside) {
        super(type, maxPeopleInside);
    }


    public void addCar() {
        cars.add(getType());
        numberOfCars++;
    }

    public void removeCar() {
        cars.remove(getType());
        numberOfCars--;
    }

    public void full(Cars cars) {
        if (numberOfCars == maxCapacityOfCars) {
            System.out.println("It is full");
        }
    }


}
