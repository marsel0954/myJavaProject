package school.lesson7;

import java.io.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

//1.	Реализовать сохранение данных в csv файл;
//2.	Реализовать загрузку данных из csv файла. Файл читается целиком.
public class Homework7 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new File("C:\\Program Files\\Java\\myJavaProject\\JavaLessons\\srctest.csv"))) {
            StringBuilder tabl = new StringBuilder();
            tabl.append("value1;");
            tabl.append("value2;");
            tabl.append("value3;");
            tabl.append('\n');
            tabl.append(100 + ";");
            tabl.append(200 + ";");
            tabl.append(213 + ";");
            tabl.append('\n');
            tabl.append(300 + ";");
            tabl.append(400 + ";");
            tabl.append(500 + ";");
            tabl.append('\n');
            writer.write(tabl.toString()); //возможно лишнее
        } catch (FileNotFoundException e){
        }
        System.out.println("C:\\Program Files\\Java\\myJavaProject\\JavaLessons\\srctest.csv"); //загрузка
    }
}
