package day14;
/*Создать .txt файл в папке проекта. Заполнить его вручную десятью произвольными числами. Реализовать статический метод
printSumDigits(File file), который считает сумму всех чисел в этом файле и выводит ее на экран.Если файла не существует
в папке проекта, в программе необходимо выбрасывать исключение и выводить в консоль сообщение “Файл не найден”.
Помимо этого, если чисел в файле меньше или больше 10, необходимо выбрасывать исключение и выводить в консоль сообщение
“Некорректный входной файл”.Вызвать данный метод в методе main().
 */

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        printSumDigits(new File("test2"));
    }

    public static void printSumDigits(File file){
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numbersString = line.split(" ");

            if(numbersString.length != 10){
                throw new IndexOutOfBoundsException();
            }
            int sum = 0;

            for (String number : numbersString){
                sum += Integer.parseInt(number);
            }

            System.out.println(sum);
        }
        catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Некорректный входной файл");
        }
    }
}
