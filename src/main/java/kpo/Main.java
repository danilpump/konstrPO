package kpo;


public class Main {
    public static void main(String[] args) {
        House house1 = new HouseBuilder().basement(true).roof(4).floors(2).buildHouse();//Проектирование на заказ
        house1.getInfo();

        House house2 = new Cottage().buildHouse(); //Заказ типа "Коттедж"
        house2.getInfo();

        House house3 = new Mansion().floors(5).basement(false).buildHouse();//Заказ типа "Особняк" с корректировками (5 этажей и без подвала)
        house3.getInfo();

        House house4 = new Bunker().buildHouse(); //Заказ типа "Бункер" (:
        house4.getInfo();
    }
}
