import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class CheckFile2 {
    public static void main(String[] args) {
        try {
            printOff();
        } catch (FileNotFoundException e){
            System.out.println("вывод в main");
        }
    }
    public static void printOff() throws FileNotFoundException {
        File file = new File("test2");
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }
}
