package kpo;

public class HouseBuilder {
    protected String name = "На заказ";             //Задаются значения по умолчанию
    protected int floors = 1;
    protected boolean basement = false;
    protected materialH matH = materialH.Пеноблоки;
    protected int roof = 2;
    protected materialR matR = materialR.Профнастил;

    public HouseBuilder() { }

    public House buildHouse() {
        return new House(name, floors, basement, matH, roof, matR);
    }

    public HouseBuilder floors(int floors) {       //Методы для заполнения полей
        this.floors = floors;
        return this;
    }

    public HouseBuilder roof(int roof) {
        this.roof = roof;
        return this;
    }

    public HouseBuilder basement(boolean basement) {
        this.basement = basement;
        return this;
    }

    public HouseBuilder matH(materialH matH) {
        this.matH = matH;
        return this;
    }

    public HouseBuilder matR(materialR matR) {
        this.matR = matR;
        return this;
    }

}
