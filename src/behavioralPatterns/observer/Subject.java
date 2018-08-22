package behavioralPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private String name;
    private List<Observer> observers = new ArrayList<>();

    public void subscribeObserver(Observer observer){
        observers.add(observer);
    }

    public void unsubscribeObserver(Observer observer){
        observers.remove(observer);
    }

    public void informObservers(Object arg){
        for (Observer observer:observers){
            observer.update(this, arg);
        }
    }

    public String getName() {
        return name;
    }
}
