package school.lesson4;

import javax.sql.rowset.CachedRowSet;
//1.    Создать классы Собака и Кот с наследованием от класса Животное.
//2.	Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//      Результатом выполнения действия будет печать в консоль.
//      (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3. 	У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
//      плавание: кот не умеет плавать, собака 10 м.).
//4. 	* Добавить подсчет созданных котов, собак и животных
//
public class Animals {
    String name;
    String beg;
    String begmax;
    String swim;
    public Animals() {
    }
    public Animals(String name){
        this.name = name;
    }
    public void AnimalsInfo(){
        System.out.println("кто: " + name);
    }
}
class Dogs extends Animals {
    String color;
    public Dogs(String name, String color, String beg, String begmax, String swim){
        this.name = name;
        this.color = color;
        this.beg = beg;
        this.begmax = begmax;
        this.swim = swim;
    }
    public void DogsInfo(){
        System.out.println("имя собаки: " + name + ". цвет собаки: " +color +
                ", пробежал: " + beg + ". максимальный бег: " + begmax + ". плавание: " + swim);
    }
}
class Cats extends Animals {
    String dlina;
    public Cats(String name, String dlina, String beg, String begmax, String swim){
        this.name = name;
        this.dlina = dlina;
        this.beg = beg;
        this.begmax = begmax;
        this.swim = swim;
    }
    public void CatsInfo(){
        System.out.println("имя кота: " + name + ". длинна шерсти: " + dlina +
                ", пробежал: " + beg + ". максимальный бег: " + begmax + ". плавание: " + swim);
    }
}
class AnimalDan {
    public static void main(String[] args) {
        int schet = 0;
        Animals animal = new Animals("домашние животные");
        Cats cat = new Cats("Мурзик","короткая"," 150м", "200м","не умеет плавать");
        schet++;
        Dogs dog = new Dogs("Мухтар","коричневый"," 150м","500м", "10м");
        schet++;
        animal.AnimalsInfo();
        cat.CatsInfo();
        dog.DogsInfo();
        System.out.println("количество " + schet);
    }
}
