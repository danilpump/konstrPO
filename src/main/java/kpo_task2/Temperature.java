package kpo_task2;

public class Temperature implements Observer{
    private String name;

    public Temperature(String name, Observable o){
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void alarm(String str) {
        System.out.println(name + " sensor detected that value out of range: " + str + " should be 360 - 500 C");
    }
}
