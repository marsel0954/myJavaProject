package school.lesson6;
//1.	Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2.	Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или
// текст вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
// в какой именно ячейке лежат неверные данные.
//3.	В методе main() вызвать полученный метод, обработать возможные исключения
// MyArraySizeException и MyArrayDataException и вывести результат расчета.


public class Practice {
   private int r1 = 4;
   private int r2 = 4;
   private String[][] size = new String[r1][r2];
   private int[][] arr = new int[r1][r2];

    public void Massive() {
        for (int i = 0; i < size.length; i++) {
            for (int j = 0; j < size[i].length; j++) {
                if ((i + j) % 2 == 0) size[i][j] = "1";
                else size[i][j] = "4";
                System.out.print(size[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void ToInt(String size[][]) {
        int i = 0;
        int j = 0;
        arr[i][j] = Integer.parseInt(size[i][j]);
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) ;
        }
    }
    public int summMass(int arr[][]){
        int summ=0;
        for (int i=0;i< arr.length;i++){
            for(int j=0;j< arr[i].length;j++){
                summ+=arr[i][j];
            }
        }
        System.out.println("Общая сумма всех элементова массива равна: "+summ);
        return summ;
    }

    public static void main(String[] args) {
        Practice ss =  new Practice();
        ss.Massive();
        ss.ToInt(ss.size);
        ss.summMass(ss.arr);
    }
}












