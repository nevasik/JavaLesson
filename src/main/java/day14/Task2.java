package day14;
/*
Реализовать статический метод List<String> parseFileToStringList(File file), который считывает содержимое этого файла и
возвращает список, состоящий из значений имен и возрастов каждого человека. Получить данный список в методе main() и распечатать
его в консоль.В случае, если файла не существует в папке проекта, в программе необходимо выбрасывать исключение и выводить в
консоль сообщение “Файл не найден”.Помимо этого, если значение возраста отрицательно, необходимо выбрасывать исключение, выводить
в консоль сообщение “Некорректный входной файл” и возвращать null или пустой список.
Пример ответа: [Mike 24, John 19, Anna 20, Miguel 5] Пример содержания файла people.txt:
Mike 24
John 19
Anna 20
Miguel 5 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(parseFileToStringList(new File("people.txt")));
    }

    public static List<String> parseFileToStringList(File file){
        List<String> people = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){ // hasNextLine-значит прокручиваем все строки в нашем файле.
                String line = scanner.nextLine();

                String[] person = line.split(" ");

                if (Integer.parseInt(person[1]) < 0){
                    throw new RuntimeException();
                }
                people.add(line);
            }
            return people;
        }
        catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        catch (RuntimeException e){
            System.out.println("Некорректный входной файл");
        }
        return null;
    }
}
