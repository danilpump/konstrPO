package kpo;

public class Cottage extends HouseBuilder{      //Шаблон "Коттедж"
    public Cottage() {
        name = "Коттедж";
        floors = 2;
        basement = true;
        matH = materialH.Бревно;
        roof = 2;
        matR = materialR.Металлочерепица;
    }
}
