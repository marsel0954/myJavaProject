package school.lesson4;
// ДЗ 7. Создать класс Park с внутренним классом, с помощью объектов
// которого можно хранить информацию об аттракционах, времени их работы и стоимости.

public class Hw7 {
    public static void main(String[] args) {
        Park p1 = new Park("disneyland"," c 9-30 до 22 00","2000 рублей");
        Park p2 = new Park("karusel", " c 8-00 До 21 00","1000 рублей");
        p1.run();
        p1.run2();
        p1.run3();
        p2.run();
        p2.run2();
        p2.run3();
    }
}
class Park {
    private String name;
    private String time;
    private String price;
    private Atr atr;
    private Vremya vremya;
    private Cost cost;
    {
        atr = new Atr();
        vremya = new Vremya();
        cost = new Cost();
        System.out.println("информация об аттракционах");
    }
    Park() {}
    Park(String name, String time, String price) {
        this.name = name;
        this.time = time;
        this.price = price;
    }
    void run() {
        atr.run();
    }
    void run2 () {
        vremya.run2();
    }
    void run3(){
        cost.run3();
    }
    class Atr {
        void run() {
            System.out.println("Парк " + Park.this.name );
        }
    }
    class Vremya {
        void run2() {
            System.out.println("время работы " + Park.this.time);
        }
    }
    class Cost {
        void run3(){
            System.out.println("стоимость " + Park.this.price);
        }
    }

}
