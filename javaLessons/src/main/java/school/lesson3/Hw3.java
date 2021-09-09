package school.lesson3;
import java.util.Arrays;
// 1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2.	Конструктор класса должен заполнять эти поля при создании объекта.
//3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
//4.	Создать массив из 5 сотрудников.
//5.	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
public class Hw3 {
    static class sotrudnik {   //java требовала использование static class
        private String familiya;
        private String imya;
        private String otchestvo;
        private String email;
        private int zarplata;
        private int vozrast;
        private String dolzhnost;
        private String telephone;

        public sotrudnik(String familiya, String imya, String otchestvo, String email,
                         int zarplata, int vozrast, String dolzhnost, String telephone) {
            this.familiya = familiya;
            this.imya = imya;
            this.otchestvo = otchestvo;
            this.email = email;
            this.zarplata = zarplata;
            this.vozrast = vozrast;
            this.dolzhnost = dolzhnost;
            this.telephone = telephone;
        }

        public static void main(String[] args) { //проблемы со статиком
            sotrudnik[] sst = new sotrudnik[5];
            sst[0] = new sotrudnik("ivanov", "ivan", "ivanovich", "rtt1@mail.ru",
                    50000, 44, "s1", "22222");
            sst[1] = new sotrudnik("artemov", "artem", "ivanovich", "rt2t@mail.ru",
                    20000, 44, "j2", "22222");
            sst[2] = new sotrudnik("vadimov", "vadim", "ivanovich", "r33tt@mail.ru",
                    20000, 44, "j2", "22222");
            sst[3] = new sotrudnik("lukov", "luk", "ivanovich", "r2tt@mail.ru",
                    60000, 33, "s2", "22222");
            sst[4] = new sotrudnik("antonov", "anton", "ivanovich", "r12tt@mail.ru",
                    44000, 22, "m3", "22222");
            for (sotrudnik sotrudnik : sst)
                if (sotrudnik.vozrast > 40) {
                    System.out.println("данные " + sotrudnik.familiya);
                    // не могу вывести значение массива через println(sst[i])
                }
        }

        }
    }
