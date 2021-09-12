package school.lesson4;

// (ДЗ 6) Создать класс Payment с внутренним классом,
// с помощью объектов которого можно сформировать покупку из нескольких товаров.


public class Payment {
    String name;
    int price;
    public Payment() {
    }
    public Payment(String name) {
        this.name = name;
    }
    public void PaymentInfo(){
        System.out.println("магазин: " + name);
    }
}
class Fruits extends Payment {
    public Fruits(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void FruitsInfo(){
        System.out.println("название :" + name + " цена : " + price);
    }
}
class Meat extends Payment{
    public Meat(String name,int price){
        this.name = name;
        this.price = price;
    }
    public void MeatInfo(){
        System.out.println("название :" + name + " цена : " + price);
    }
}
class Prodinfo {
    public static void main(String[] args) {
    Payment payment = new Payment("Пятерочка");
    Fruits fruit1 = new Fruits(" апельсин ", 50);
    Fruits fruit2 = new Fruits(" яблоко ",40);
    Meat meat1 = new Meat(" курица ", 150);
    Meat meat2 = new Meat(" говядина", 250);
    payment.PaymentInfo();
    fruit1.FruitsInfo();
    fruit2.FruitsInfo();
    meat2.MeatInfo();
    meat1.MeatInfo();
    }
}