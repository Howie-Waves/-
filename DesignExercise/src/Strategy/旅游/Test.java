package Strategy.旅游;

public class Test {
    public static void main(String[] args) {
        Person p = new Person(new TravelByPlane());
        p.goTraveling();

        p.setTravel(new TravelByBike());
        p.goTraveling();
    }
}
