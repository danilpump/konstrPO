package kpo;

public class Bunker extends HouseBuilder{      //Шаблон "Бункер"
    public Bunker() {
        name = "Бункер";
        floors = -5;
        basement = true;
        matH = materialH.БетонМеталл;
        roof = 0;
        matR = materialR.Земля;
    }
}
