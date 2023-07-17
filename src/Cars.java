public class Cars  {
public Cars type;
public int maxPeopleInside;

    public Cars(Cars type, int maxPeopleInside) {
        this.type = type;
        this.maxPeopleInside = maxPeopleInside;
    }



    public Cars getType() {
        return type;
    }

    public void setType(Cars type) {
        this.type = type;
    }

    public int getMaxPeopleInside() {
        return maxPeopleInside;
    }

    public void setMaxPeopleInside(int maxPeopleInside) {
        this.maxPeopleInside = maxPeopleInside;
    }
}
