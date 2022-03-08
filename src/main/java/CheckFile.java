import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static java.io.File.separator;

public class CheckFile {
    public static void main(String[] args) throws FileNotFoundException {

        //String way = separator + "C:" + separator + "Users" + separator + "Dima" + separator + "Downloads" + separator + "Java.txt";

        File file = new File("test2");

        Scanner scanner = new Scanner(file);

        String numbersString = scanner.nextLine();
        int [] number = new int[3];
        int counter = 0;


        String[] words = numbersString.split(" ");// split-указывается в его аргументах то, чем разделяются слова в файле(пробел,число скок пробелов и т.д.)
        for(String numbers : words) {
            number[counter++] = Integer.parseInt(numbers);
        }

        System.out.println(Arrays.toString(number));

        scanner.close();
        
    }
}
