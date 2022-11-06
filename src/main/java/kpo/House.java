package kpo;

enum materialH {Бревно,Брус,Кирпич,Каркасный,СиликатБлоки,Пеноблоки,БетонМеталл}
enum materialR {Шифер,Профнастил,Металлочерепица,Ондулин, НатурЧерепица,Земля}

public class House {

    private String name;             //Название (тип заказа)
    private int floors;              //Количество этажей
    private boolean basement;        //Наличие подвала
    private materialH matH;          //Материал
    private int roof;                //Количество скатов крыши
    private materialR matR;          //Материал крыши

    public House(String name, int floors, boolean basement, materialH matH, int roof, materialR matR){
        this.name = name;
        this.floors = floors;
        this.basement = basement;
        this.matH = matH;
        this.roof = roof;
        this.matR = matR;
    }

    public void getInfo() {         //Метод вывода информации о доме
        System.out.println(name);
        System.out.println("Количество этажей: " + floors);
        System.out.println("Материал: " + matH.toString());
        System.out.print("Подвал: ");
        if (basement)
            System.out.println("есть");
        else
            System.out.println("нет");

        System.out.println("Скатов крыши: " + roof);
        System.out.println("Материал крыши: " + matR.toString()+ "\n");
    }
}
