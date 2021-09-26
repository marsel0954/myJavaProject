package school.lesson6;
//1.	Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2.	Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
// текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
// в какой именно ячейке лежат неверные данные.
//3.	В методе main() вызвать полученный метод, обработать возможные исключения
// MyArraySizeException и MyArrayDataException и вывести результат расчета.

import java.util.Arrays;
public class Homework6 {


    public static void main(String[] args) {
        int r1 = 4;
        int r2 = 4;
        int sum = 0;
        String[][] size = new String[r1][r2];
        int[][] arr = new int[r1][r2];
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                if ((i + j) % 2 == 0) size[i][j] = "1";
                else size[i][j] = "4";
                {
                    arr[i][j] = Integer.parseInt(size[i][j]);
                    {
                        sum+=arr[i][j];
                    }

                }
            }
        }System.out.println(" cумма " + sum);
    }
}