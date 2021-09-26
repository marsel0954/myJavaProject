package school.lesson8;

 //1.	Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать, сколько раз встречается каждое слово.

//2.	Написать простой класс Телефонный Справочник,
// который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи,
// а с помощью метода get() искать номер телефона по фамилии. Следует учесть,
// что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все


import java.util.*;

public class Hw8 {
    public static void main(String[] args) {
        List<String> naborslov = Arrays.asList("сон","конь","слон","вон","коса","оса","сон","сон");
        System.out.println("Список слов:");
        naborslov.forEach(System.out::println);

        System.out.println("\nБез повторов(Уникальные) : ");
        Set<String> unique = new HashSet<>(naborslov);
        unique.forEach(System.out::println);

        System.out.println("\nколичество слов:");
        Map<String,Integer> wordsCount = new HashMap<>();
        for (String s : naborslov) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);

///////////////////////////////////////ЗАДАЧА 2
        List<String> spravka = Arrays.asList("аня  22222","вася 3333");
        System.out.println("\n изначальный список номеров:");
        spravka.forEach(System.out::println);

        System.out.println("\nновый список");
        Set<String> dobav = new HashSet<>(spravka);
        dobav.add("марина 8888");
        dobav.add("michael 9999");
        dobav.add("michael 119999");
        dobav.forEach(System.out::println);

        System.out.println("\nпо вашему запросу:");
        // Map<String,Integer> need = new HashMap<>();
       // need.get("michael");
       // need.forEach(System.out::println);

    }
}
