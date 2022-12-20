package kpo_task2;

public class Pressure implements Observer{
    private String name;

    public Pressure(String name, Observable o){
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void alarm(String str) {
        System.out.println(name + " sensor detected that value out of range: " + str + ", should be 4.8 - 5.5 MPa");
    }
}
