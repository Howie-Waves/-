package Strategy.旅游;

public class Person {
    Travel travel;
    public Person(Travel travel){
        this.travel = travel;
    }
    public Person(){}

    public Travel getTravel() {
        return travel;
    }

    public void setTravel(Travel travel) {
        this.travel = travel;
    }

    public void goTraveling(){
        travel.travel();
    }
}
