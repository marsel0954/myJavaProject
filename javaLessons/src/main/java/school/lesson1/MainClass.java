package school.lesson1;  //объединил все задачи в одну

public class MainClass {
    public static void printThreeWords()  { // домашнее задание 2
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();//использовал,чтобы был пропуск строки между выводом резульат заданиями
    }
    public static void checkSumSign() { // домашнее задание 3
        int a = 7;
        int b = 9;
        int c = a + b;
        if (c > 0)    {
            System.out.println("Сумма положительная");
            System.out.println();
        }
        if (c < 0) {
            System.out.println("сумма отрицательная");
            System.out.println();
        }
    }
    public static void printColor() { // домашнее задание 4
        int value = 33;
        if (value <= 0) {
            System.out.println("Красный");
            System.out.println();
        }
        if (value > 0 && value < 100) {
            System.out.println("Желтый");
            System.out.println();
        }
        if (value > 100) {
            System.out.println("Зеленый");
            System.out.println();
        }
    }
    public static void compareNumbers() { // домашнее задание 5
        int a = 3;
        int b = 11;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
    public static void main(String[] args) { // домашнее задание 6
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
} // run запускается корректно
