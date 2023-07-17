public class Cars extends ParkingPlace {
public String type;
public int maxPeopleInside;

    public Cars(String type, int maxPeopleInside) {
        this.type = type;
        this.maxPeopleInside = maxPeopleInside;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMaxPeopleInside() {
        return maxPeopleInside;
    }

    public void setMaxPeopleInside(int maxPeopleInside) {
        this.maxPeopleInside = maxPeopleInside;
    }
}
