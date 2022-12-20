package kpo_task2;

import java.util.ArrayList;
import java.util.List;

public class ObservableTerminal implements Observable{
    private List<Observer> observers = new ArrayList<>();

    public ObservableTerminal(){
        Observer thrObserver = new RSpeed("RS1",this);
        Observer secObserver = new Temperature("T1",this);
        Observer fstObserver = new Pressure("P1",this);
    }

    private int rspeed;
    private int temperature;
    private double presssure;


    public void speedLog(int input) {
        this.rspeed = input;
        if (2999>input || input>3001)
            notifyObservers(0);
    }

    public void tempLog(int input) {
        this.temperature = input;
        if (360 > input || input > 500)
            notifyObservers(1);
    }

    public void pressLog(double input) {
        this.presssure = input;
        if (4.8 > input || input > 5.5)
            notifyObservers(2);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(int check) {
        switch (check) {
            case 0 -> observers.get(0).alarm(Integer.toString(rspeed));
            case 1 -> observers.get(1).alarm(Integer.toString(temperature));
            case 2 -> observers.get(2).alarm(Double.toString(presssure));
        }
    }
}
