package Observer.电子商务系统;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Subject{
    List<Observer> observerList;
    String name;

    public Customer(String name){
        this.name = name;
        observerList = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList){
            observer.update();
        }
    }

    public String getInfo(){
        return name;
    }
}
