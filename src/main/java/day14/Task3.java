package day14;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(parseFileToObjList(new File("people.txt")));
    }

    public static List<Person> parseFileToObjList(File file){
        List<Person> people = new ArrayList<>(); // <Person> -это значит мы помещаем в этот список объект класса.
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){ // hasNextLine-значит прокручиваем все строки в нашем файле.
                String line = scanner.nextLine();

                String[] massive = line.split(" ");

                if (Integer.parseInt(massive[1]) < 0){
                    throw new RuntimeException();
                }
                Person currentPerson = new Person(massive[0], Integer.parseInt(massive[1]));
                people.add(currentPerson);
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
