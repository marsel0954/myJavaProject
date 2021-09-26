package school.lesson2;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        zadan8();
    }

    // (ДЗ 1) Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    public static boolean zadan1(int a, int b) {
        int sum = a + b;
        if (sum <= 10 && sum <= 20) return true;
        else return false;
    }
    // (ДЗ 2) Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание:
    // ноль считаем положительным числом.
    public static void zadan2(int a) {
        if (a >= 0) {
            System.out.println("число положительное");
        } else {
            System.out.println("число отрицательное");
        }
    }
    // (ДЗ 3) Написать метод, которому в качестве параметра передается целое число.
    //  Метод должен вернуть true, если число отрицательное,
    //  и вернуть false если положительное

    public static boolean zadan3(int a) { //или надо было использовать system.out.println и через void и сканер??
        if (a >= 0) return false;
        else {
            return true;
        }
    }
    //(ДЗ 4) Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void zadan4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        String b = sc1.nextLine();
        for (int i = 0; i < a; i++) ;
        System.out.println(b);
        sc.close();
    }
    //(ДЗ 5) Написать метод, который определяет, является ли год високосным,
    // и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный
    public static boolean zadan4(int a) {
        if (a % 4 == 0 || a % 400 == 0 && a % 100 != 0) return true;
        else {
            return false;
        }
    }

    public static void zadan41(int a) {
        if (a % 4 == 0 || a % 400 == 0 && a % 100 != 0) {
            System.out.println("високосный");
        } else {
            System.out.println("не високосный");
        }

    }
    // (ДЗ 6) Задать целочисленный массив, состоящий из элементов 0 и 1.
    // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void zadan6() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else arr[i] = 1;
    }
    // ДЗ(7) Задать пустой целочисленный массив длиной 100.
    // С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void zadan7() {
        int a = 100;
        int err[] = new int[a];
        for (int i = 0; i < err.length; ++i) {
            err[i] = i + 1;
        }
    }
    // (ДЗ 8) Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    // и числа меньшие 6 умножить на 2;
    public static void zadan8() {
        int arr[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.println(arr[i]);
            }

        }

        // (ДЗ 9) Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
        // если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
        // индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];



        }

    }
