package kpo;

public class Mansion extends HouseBuilder{      //Шаблон "Особняк"
    public Mansion(){
        name = "Особняк";
        floors = 3;
        basement = true;
        matH = materialH.Кирпич;
        roof = 4;
        matR = materialR.НатурЧерепица;
    }
}
