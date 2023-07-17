import java.util.ArrayList;
import java.util.List;

public class ParkingPlace extends Cars {

    int maxCapacityOfCars = 20;
    List<Cars> cars = new ArrayList<>();


    public ParkingPlace(Cars type, int maxPeopleInside) {
        super(type, maxPeopleInside);
    }


    public void addCar() {
        cars.add(getType());

    }

    public void removeCar() {
        cars.remove(getType());

    }

    public void full(Cars car) {
        if ( this.cars.size()==maxCapacityOfCars) {
            System.out.println("It is full");
        }
    }


}
